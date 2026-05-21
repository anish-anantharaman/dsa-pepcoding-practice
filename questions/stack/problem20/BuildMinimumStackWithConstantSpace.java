import java.util.*;
import java.io.*;

public class BuildMinimumStackWithConstantSpace {

    public static class MinStack {
        Stack<Integer> stack;
        int min;

        MinStack() {
            stack = new Stack<>();
        }

        void push(int val) {
            if(stack.isEmpty()) {
                stack.push(val);
                min = val;
            } else if(val >= min) {
                stack.push(val);
            } else {
                stack.push(val + val - min); // detection, storing a fake smaller value
                min = val; // original value is stored in min
            }
        }

        void pop() {
            if(stack.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else if(stack.peek() >= min) {
                System.out.println(stack.pop());
            } else {
                System.out.println(min);
                min = (2 * min) - stack.pop();
            }
        }

        void top() {
            if(stack.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else if(stack.peek() >= min) {
                System.out.println(stack.peek());
            } else {
                System.out.println(min);
            }
        }

        void min() {
            if(stack.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(min);
            }
        }

        void size() {
            System.out.println(stack.size());
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            String[] parts = br.readLine().split(" ");
            String action = parts[0];
            int val;
            MinStack minStack = new MinStack();

            while(!"quit".equals(action)) {
                switch (action) {
                    case "push":
                        val = Integer.parseInt(parts[1]);
                        minStack.push(val);
                        break;
                    case "pop":
                        minStack.pop();
                        break;
                    case "top":
                        minStack.top();
                        break;
                    case "min":
                        minStack.min();
                        break;
                    case "size":
                        minStack.size();
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