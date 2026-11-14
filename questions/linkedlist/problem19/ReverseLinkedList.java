import java.util.Scanner;

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {

        Node head;
        Node tail;
        int size;

        Node left; // left node for reversing linked list

        void addLast(int val) {

            Node node = new Node();
            node.data = val;
            node.next = null;

            if(size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            ++size;
        }

        void addFirst(int val) {
            Node node = new Node();
            node.data = val;
            node.next = head;
            head = node;

            if(size == 0) {
                tail = head;
            }
            ++size;
        }

        void display() {
            Node node = this.head;
            while(node != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.println("NULL");
        }

        void reverseDRHelper(Node right, int floor) {
            if(right == null) {
                return;
            }
            reverseDRHelper(right.next, floor + 1);

            if(floor >= size / 2) {
                int temp = right.data;
                right.data = left.data;
                left.data = temp;

                left = left.next;
            }
        }

        void reverseDR() {
            left = this.head;
            reverseDRHelper(this.head, 0);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList list = new LinkedList();

        for(int i = 0; i < n; ++i) {
            list.addLast(scanner.nextInt());
        }
        int last = scanner.nextInt();
        int first = scanner.nextInt();

        list.display();
        list.reverseDR();
        list.addLast(last);
        list.addFirst(first);
        list.display();
    }
}