import java.util.Scanner;

public class OddEvenList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                size = 0;
                head = tail = null;
            } else {
                --size;
                head = head.next;
            }
        }

        Node getFirst() {
            if(size == 0) {
                return null;
            } else {
                return head;
            }
        }

        void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while(this.size > 0) {
                int val = this.getFirst().data;
                this.removeFirst();

                if(val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
            }

            if(odd.size == 0) {
                this.head = even.head;
                this.tail = even.tail;
            }
            else if(even.size == 0) {
                this.head = odd.head;
                this.tail = odd.tail;
            }
            else {
                odd.tail.next = even.head;

                this.head = odd.head;
                this.tail = even.tail;
            }

            this.size = odd.size + even.size;
        }

        void display() {
            Node node = this.head;
            while(node != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList list = new LinkedList();
        int n = scanner.nextInt();

        // Get the values in Linked List
        for(int i = 0; i < n; ++i) {
            int val = scanner.nextInt();
            list.addLast(val);
        }

        // Get the values for addFirst() and addLast()
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        list.oddEven();
        list.addFirst(first);
        list.addLast(last);
        list.display();
    }
}