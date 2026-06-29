import java.util.*;
import java.io.*;

public class LinkedListToStackAdapter {


    public static class Adapter {
        LinkedList<Integer> linkedList;

        Adapter() {
            linkedList = new LinkedList<>();
        }

        void push(int value) {
            linkedList.addFirst(value);
        }

        void pop() {
            if(linkedList.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(linkedList.removeFirst());
            }
        }

        void top() {
            if(linkedList.isEmpty()) {
                System.out.println("Stack underflow");
                System.out.println(-1);
            } else {
                System.out.println(linkedList.peek());
            }
        }

        void size() {
            System.out.println(linkedList.size());
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String[] parts = br.readLine().split(" ");
            String action = parts[0];

            Adapter adapter = new Adapter();

            while(!"quit".equals(action)) {
                switch(action) {
                    case "push":
                        int value = Integer.parseInt(parts[1]);
                        adapter.push(value);
                        break;
                    case "pop":
                        adapter.pop();
                        break;
                    case "top":
                        adapter.top();
                        break;
                    case "size":
                        adapter.size();
                        break;
                    default:
                        throw new RuntimeException("Invalid action value");
                }

                parts = br.readLine().split(" ");
                action = parts[0];
            }
        } catch(IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}