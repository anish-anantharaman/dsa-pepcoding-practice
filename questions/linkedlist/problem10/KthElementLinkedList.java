import java.io.*;

public class KthElementLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int n) {
            Node node = new Node();
            node.data = n;
            node.next = null;

            if(size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            ++size;
        }

        void kthElementFromLast(int k) {
            Node first = head;
            Node second = head;

            // Keep `first` node and `second` node separated by k
            for(int i = 0; i < k; ++i) {
                second = second.next;
            }

            // Traverse both `first` node and `second` node till the end of LinkedList maintaining gap of k elements
            while(second != tail) {
                first = first.next;
                second = second.next;
            }
            System.out.println(first.data);
        }

    }

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            String[] parts = br.readLine().split(" ");
            String action = parts[0];

            LinkedList linkedList = new LinkedList();


            while (!"quit".equals(action)) {
                switch (action) {
                    case "add":
                        int data = Integer.parseInt(parts[1]);
                        linkedList.addLast(data);
                        break;
                    case "kth":
                        int k = Integer.parseInt(parts[1]);
                        linkedList.kthElementFromLast(k);
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