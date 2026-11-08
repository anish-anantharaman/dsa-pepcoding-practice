import java.util.Scanner;

public class DisplayReverseLinkedList {

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

            if(this.size == 0) {
                tail = node;
            }
            ++size;
        }

        void display() {
            Node node = this.head;
            while(node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }

        void displayReverse() {
            displayReverseHelper(this.head);
            System.out.println();
        }

        void displayReverseHelper(Node node) {
            if(node == null) {
                return;
            }
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
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

        int first = scanner.nextInt();
        int last = scanner.nextInt();
        list.display();
        list.displayReverse();

        list.addFirst(first);
        list.addLast(last);
        list.display();
    }
}