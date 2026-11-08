import java.util.Scanner;

public class PointerRecursiveReverseLinkedList {

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

        void addFirst(int n) {
            Node node = new Node();
            node.data = n;
            node.next = head;
            head = node;

            if(size == 0) {
                tail = node;
            }
            ++size;
        }

        void reversePRHelper(Node node) {
            if(node == null) {
                return;
            }
            reversePRHelper(node.next);

            if(node.next != null) {
                node.next.next = node;
            }
        }

        void reversePR() {
            if(head == null) {
                return;
            }

            reversePRHelper(head);

            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
        }

        void display() {
            Node node = this.head;

            while(node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList list = new LinkedList();
        for(int i = 0; i < n; ++i) {
            int val = scanner.nextInt();
            list.addLast(val);
        }

        int last = scanner.nextInt();
        int first = scanner.nextInt();

        // Before reversing the Linked List
        list.display();

        // Reverse the Linked List
        list.reversePR();

        // Add First and Add Last
        list.addLast(last);
        list.addFirst(first);

        list.display();
    }
}