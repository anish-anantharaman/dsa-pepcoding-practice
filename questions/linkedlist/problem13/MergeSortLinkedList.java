import java.util.Scanner;

/** Need to understand this algorithm better and practice more */

public class MergeSortLinkedList {


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

        Node midNode(Node head, Node tail) {
            Node f = head;
            Node s = head;

            while(f != tail
                    && f.next != tail) {
                f = f.next.next;
                s = s.next;
            }
            return s;
        }

        LinkedList mergeTwoSortedLinkedList(LinkedList list1, LinkedList list2) {
            LinkedList list3 = new LinkedList();

            Node node1 = list1.head;
            Node node2 = list2.head;

            while(node1 != null && node2 != null) {
                if(node1.data < node2.data) {
                    list3.addLast(node1.data);
                    node1 = node1.next;
                } else {
                    list3.addLast(node2.data);
                    node2 = node2.next;
                }
            }

            while(node1 != null) {
                list3.addLast(node1.data);
                node1 = node1.next;
            }

            while (node2 != null) {
                list3.addLast(node2.data);
                node2 = node2.next;
            }
            return list3;
        }

        LinkedList mergeSort(Node head, Node tail) {

            if(head == tail) {
                LinkedList linkedList = new LinkedList();
                linkedList.addLast(head.data);
                return linkedList;
            }

            Node mid = midNode(head, tail);
            LinkedList firstSortedHalf = mergeSort(head, mid);
            LinkedList secondSortedHalf = mergeSort(mid.next, tail);
            LinkedList finalList = mergeTwoSortedLinkedList(firstSortedHalf, secondSortedHalf);
            return finalList;
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
        int n = scanner.nextInt();

        LinkedList linkedList = new LinkedList();

        for(int i = 0; i < n; ++i) {
            linkedList.addLast(scanner.nextInt());
        }

        LinkedList finalList = new LinkedList();
        finalList = finalList.mergeSort(linkedList.head,
                linkedList.tail);

        LinkedList.display(linkedList);
        LinkedList.display(finalList);
    }
}