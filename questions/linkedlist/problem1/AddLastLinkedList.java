import java.util.Scanner;

public class AddLastLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            ++size;
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();
        System.out.println("Enter elementa (-1 to stop)");
        while(true) {
            int val = scanner.nextInt();
            if(val == -1) break;
            linkedList.addLast(val);
        }
        System.out.println("Linked List:");
        linkedList.display();
    }
}