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
            // Move all existing elements to helperS, then add the new element to mainS
            while(size() > 0) {
                helperS.push(mainS.pop());
            }
            mainS.push(n);

            // Now, move all elements in helperS back to mainS
            while(helperS.size() > 0) {
                mainS.push(helperS.pop());
            }
        }

        int remove() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            return mainS.pop();
        }

        int peek() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            return mainS.peek();
        }

        int size() {
            return mainS.size();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Adapter adapter = new Adapter();

        String action = scanner.next();

        while(!"quit".equals(action)) {

            switch (action) {
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