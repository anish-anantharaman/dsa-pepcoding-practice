import java.io.*;

public class LinkedListMidElement {

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

        void middleElement() {

            Node first = head;
            Node second = head;

            while(second.next != null && second.next.next != null) {
                first = first.next;
                second = second.next.next;
            }
            System.out.println(first.data);
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String[] parts = br.readLine().split(" ");
            String action = parts[0];

            LinkedList linkedList = new LinkedList();

            while(!"quit".equals(action)) {
                switch (action) {
                    case "add":
                        int n = Integer.parseInt(parts[1]);
                        linkedList.addLast(n);
                        break;
                    case "mid":
                        linkedList.middleElement();
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