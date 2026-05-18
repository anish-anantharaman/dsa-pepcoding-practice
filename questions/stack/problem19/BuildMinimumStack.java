import java.util.*;
import java.io.*;

public class BuildMinimumStack {

    public static class MinStack {
        Stack<Integer> data;
        Stack<Integer> minData;

        MinStack() {
            data = new Stack<>();
            minData = new Stack<>();
        }

        void push(int val) {
            data.push(val);
            if(minData.isEmpty() ||
                minData.peek() >= val) {
                minData.push(val);
            }
        }

        void pop() {
            if(data.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                if (data.peek() == minData.peek()) {
                    minData.pop();
                }
                System.out.println(data.pop());
            }
        }

        void top() {
            if(data.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(data.peek());
            }
        }

        void size() {
            System.out.println(data.size());
        }

        void min() {
            if(minData.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(minData.peek());
            }
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            MinStack minStack = new MinStack();

            String[] parts = br.readLine().split(" ");
            String action = parts[0];

            while (!"quit".equals(action)) {
                switch(action) {
                    case "push":
                        int val = Integer.parseInt(parts[1]);
                        minStack.push(val);
                        break;
                    case "pop":
                        minStack.pop();
                        break;
                    case "top":
                        minStack.top();
                        break;
                    case "size":
                        minStack.size();
                        break;
                    case "min":
                        minStack.min();
                        break;
                    default:
                        throw new RuntimeException("Invalid action");
                }
                parts = br.readLine().split(" ");
                action = parts[0];
            }
        } catch(IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}