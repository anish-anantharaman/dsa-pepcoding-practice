import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class QueueToStackAdapter {

    public static class Adapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        Adapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        int pop() {
            if(size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.remove();
            }
        }

        int top() {
            if(size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.peek();
            }
        }

        void push(int n) {
            int val;
            // Move all elements of mainQ to helperQ
            while(size() > 0) {
                val = mainQ.remove();
                helperQ.add(val);
            }

            // Add the new element to mainQ
            mainQ.add(n);

            // Remove elements from helperQ and add to mainQ
            while(helperQ.size() > 0) {
                val = helperQ.remove();
                mainQ.add(val);
            }
        }

        void display() {
            for(int val : mainQ) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Adapter adapter = new Adapter();

        String action = scanner.next();
        while(!"quit".equals(action)) {
            switch(action) {
                case "push":
                    int val = scanner.nextInt();
                    adapter.push(val);
                    break;
                case "pop":
                    System.out.println(adapter.pop());
                    break;
                case "top":
                    System.out.println(adapter.top());
                    break;
                case "size":
                    System.out.println(adapter.size());
                    break;
                case "display":
                    adapter.display();
                    break;
                default:
                    throw new RuntimeException("Invalid action value");
            }
            action = scanner.next();
        }
    }
}