import java.util.*;
import java.io.*;

public class LinkedListToQueueAdapter {

    public static class Adapter {
        LinkedList<Integer> linkedList;

        Adapter() {
            linkedList = new LinkedList<>();
        }

        void add(int value) {
            linkedList.addLast(value);
        }

        void remove() {
            if(linkedList.isEmpty()) {
                System.out.println("Queue underflow");
                System.out.println(-1);
            } else {
                System.out.println(linkedList.removeFirst());
            }
        }

        void peek() {
            if(linkedList.isEmpty()) {
                System.out.println("Queue underflow");
                System.out.println(-1);
            } else {
                System.out.println(linkedList.getFirst());
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
            while(!"quit".equals(action)){

                switch(action) {
                    case "add":
                        int value = Integer.parseInt(parts[1]);
                        adapter.add(value);
                        break;
                    case "remove":
                        adapter.remove();
                        break;
                    case "peek":
                        adapter.peek();
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
        } catch (IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}