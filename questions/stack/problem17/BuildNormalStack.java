import java.util.*;
import java.io.*;

public class BuildNormalStack {


    public static class CustomStack {

        int[] data;
        int tos; // top of stack

        CustomStack(int n) {
            data = new int[n];
            tos = -1;
        }

        void push(int n) {
            if((data.length - 1) == tos) {
                System.out.println("Stack overflow");
            } else {
                ++tos;
                data[tos] = n;
            }
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

        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
            CustomStack customStack = new CustomStack(n);
            for (int i = 0; i < n; ++i) {
                String input = br.readLine();
                String[] parts = input.split(" ");
                String action = parts[0];

                switch(action) {
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
                    default: throw new RuntimeException("Invalid action value");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error in bufferedreader");
        }
    }

}