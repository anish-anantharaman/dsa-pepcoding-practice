import java.util.Scanner;


public class MergeTwoSortedLinkedList {

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


        static void mergeLinkedLists(LinkedList linkedList1,
                              LinkedList linkedList2) {

            LinkedList linkedList3 = new LinkedList();

            Node node1 = linkedList1.head;
            Node node2 = linkedList2.head;

            while(node1 != null && node2 != null) {
                if(node1.data <= node2.data) {
                    linkedList3.addLast(node1.data);
                    node1 = node1.next;
                } else {
                    linkedList3.addLast(node2.data);
                    node2 = node2.next;
                }
            }

            while(node1 != null) {
                linkedList3.addLast(node1.data);
                node1 = node1.next;
            }

            while(node2 != null) {
                linkedList3.addLast(node2.data);
                node2 = node2.next;
            }
            display(linkedList3);
        }

        static void display(LinkedList linkedList) {
            Node node = linkedList.head;
            while(node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int l1, l2;


        // Input of first Linked List
        l1 = scanner.nextInt();
        LinkedList linkedList1 = new LinkedList();
        for(int i = 0; i < l1; ++i) {
            int data = scanner.nextInt();
            linkedList1.addLast(data);
        }


        // Input of second Linked List
        l2 = scanner.nextInt();
        LinkedList linkedList2 = new LinkedList();
        for(int i = 0; i < l2; ++i) {
            int data = scanner.nextInt();
            linkedList2.addLast(data);
        }

        LinkedList.mergeLinkedLists(linkedList1, linkedList2);
    }


}