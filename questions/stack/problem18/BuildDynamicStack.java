import java.util.*;
import java.io.*;

public class BuildDynamicStack {

    public static class CustomStack {

        int[] data;
        int tos; // top of the stack

        CustomStack(int n) {
            this.data = new int[n];
            tos = -1;
        }

        void push(int val) {
            if(data.length - 1 == tos) {
                int len = data.length * 2;
                int[] newArr = new int[len];

                // copy elements from the old array
                for(int i = 0; i < data.length; ++i) {
                    newArr[i] = data[i];
                }
                data = newArr;
            }
            ++tos;
            data[tos] = val;

        }

        void pop() {
            if(tos == -1) {
                System.out.println("Stack underflow");
            } else {
                int val = data[tos];
                --tos;
                System.out.println(val);
            }
        }

        void top() {

            if(tos == -1) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(data[tos]);
            }
        }

        void size() {
            System.out.println(tos + 1);
        }

        void display() {
            for(int i = tos; i >= 0; --i) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        try {
            int n = Integer.parseInt(br.readLine());
            CustomStack customStack = new CustomStack(n);

            String[] parts = br.readLine().split(" ");
            String action = parts[0];
           while(!"quit".equals(action)) {
                switch (action) {
                    case "push":
                        int val = Integer.parseInt(parts[1]);
                        customStack.push(val);
                        break;
                    case "pop":
                        customStack.pop();
                        break;
                    case "top":
                        customStack.top();
                        break;
                    case "size":
                        customStack.size();
                        break;
                    case "display":
                        customStack.display();
                        break;
                    default:
                        throw new RuntimeException("Invalid action value");
                }
               parts = br.readLine().split(" ");
               action = parts[0];
            }
        } catch (IOException e) {
            throw new RuntimeException("Error in bufferedreader");
        }

    }
}