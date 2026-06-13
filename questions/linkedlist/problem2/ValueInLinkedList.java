import java.util.*;
import java.io.*;

public class ValueInLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        void display() {
            Node temp = head;
            if(size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("NULL");
            }
        }

        void fetchFirst() {
            if(size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else {
                System.out.println(head.data);
            }
        }

        void fetchLast() {
            if(size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else {
                System.out.println(tail.data);
            }
        }

        void fetchByIndex(int index) {
            if(size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else if(index >= size || index < 0) {
                System.out.println("Invalid argument");
                System.out.println(-1);
            } else {
                Node node = head;
                for (int i = 0 ; i < index; ++i) {
                    node = node.next;
                }
                System.out.println(node.data);
            }
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
                        int val = Integer.parseInt(parts[1]);
                        linkedList.addLast(val);
                        break;
                    case "first":
                        linkedList.fetchFirst();
                        break;
                    case "last":
                        linkedList.fetchLast();
                        break;
                    case "index":
                        int index = Integer.parseInt(parts[1]);
                        linkedList.fetchByIndex(index);
                        break;
                    case "display":
                        linkedList.display();
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