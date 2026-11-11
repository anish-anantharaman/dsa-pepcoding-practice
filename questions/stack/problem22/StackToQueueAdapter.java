import java.util.Scanner;
import java.util.Stack;

public class StackToQueueAdapter {

    public static class Adapter {

        Stack<Integer> mainS;
        Stack<Integer> helperS;

        Adapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        void add(int n) {
            mainS.push(n);
        }

        int remove() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            while(size() > 1) {
                helperS.push(mainS.pop());
            }

            int val = mainS.pop();

            while(helperS.size() > 0) {
                mainS.push(helperS.pop());
            }
            return val;
        }

        int peek() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            while(size() > 1) {
                helperS.push(mainS.pop());
            }

            int val = mainS.peek();

            while(helperS.size() > 0) {
                mainS.push(helperS.pop());
            }
            return val;
        }

        int size() {
            return mainS.size();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        Adapter adapter = new Adapter();

        while(!"quit".equals(action)) {
            switch(action) {
                case "add":
                    int n = scanner.nextInt();
                    adapter.add(n);
                    break;
                case "remove":
                    System.out.println(adapter.remove());
                    break;
                case "peek":
                    System.out.println(adapter.peek());
                    break;
                case "size":
                    System.out.println(adapter.size());
                    break;
                default:
                    throw new RuntimeException("Invalid action value");
            }
            action = scanner.next();
        }
    }
}