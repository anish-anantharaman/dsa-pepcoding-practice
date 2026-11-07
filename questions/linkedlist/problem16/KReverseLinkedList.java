import java.util.Scanner;

public class KReverseLinkedList {

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

        void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                --size;
            }
        }

        Node getFirst() {
            if(size == 0) {
                System.out.println("List is empty");
                return null;
            } else {
                return head;
            }
        }

        void display() {
            Node node = this.head;
            while(node != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.println("NULL");

        }

        void kReverse(int k) {

            if(k <= 1 || this.size <= 1) {
                return;
            }

            LinkedList previous = null;

            while(this.size > 0) {
                LinkedList current = new LinkedList();

                if(this.size >= k) {
                    for(int i = 0; i < k; ++i) {
                        int val = this.getFirst().data;
                        this.removeFirst();
                        current.addFirst(val);
                    }
                } else {
                    int originalSize = this.size;
                    for(int i = 0; i < originalSize; ++i) {
                        int val = this.getFirst().data;
                        this.removeFirst();
                        current.addLast(val);
                    }
                }

                if(previous == null) {
                    previous = current;
                } else {
                    previous.tail.next = current.head;
                    previous.tail = current.tail;
                    previous.size += current.size;
                }
            }
            this.head = previous.head;
            this.tail = previous.tail;
            this.size = previous.size;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList list = new LinkedList();
        for(int i = 0; i < n; ++i) {
            int v = scanner.nextInt();
            list.addLast(v);
        }

        int k = scanner.nextInt();
        list.kReverse(k);

        list.display();
    }
}