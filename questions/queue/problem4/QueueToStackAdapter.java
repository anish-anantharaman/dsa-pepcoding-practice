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

        void push(int n) {
            mainQ.add(n);
        }

        int pop() {
            if(size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }

            while(size() > 1) {
                helperQ.add(mainQ.remove());
            }

            int n = mainQ.remove();

            while(helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return n;
        }

        int top() {

            if(size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }

            while(size() > 1) {
                helperQ.add(mainQ.remove());
            }

            int n = mainQ.remove();
            helperQ.add(n);

            while(helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return n;
        }

        int size() {
            return mainQ.size();
        }

        void display() {
            if(size() == 0) {
                System.out.println("Stack underflow");
                return;
            }

            for(int val : mainQ) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String action = scanner.next();
        Adapter adapter = new Adapter();

        while(!"quit".equals(action)) {
            switch(action) {
                case "push":
                    int n = scanner.nextInt();
                    adapter.push(n);
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