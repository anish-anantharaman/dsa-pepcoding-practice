import java.util.Scanner;

public class RemoveDuplicatesInLinkedList {

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

        void removeDuplicates(LinkedList list) {
            Node current = head;
            while(current != null && current.next != null) {
                if(current.data == current.next.data) {
                    current.next = current.next.next;
                    --size;
                } else {
                    current = current.next;
                }
            }
            tail = current;
        }

        void display() {
            Node node = head;
            while(node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList linkedList = new LinkedList();
        for(int i = 0; i < n; ++i) {
            linkedList.addLast(scanner.nextInt());
        }

        linkedList.removeDuplicates(linkedList);
        linkedList.display();
    }
}