import java.util.*;
import java.io.*;

public class RemoveAtIndexLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int value) {
            Node node = new Node();
            node.data = value;
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
            Node node = head;
            while(node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("NULL");
        }

        void removeAt(int index) {
            if(size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else if(index < 0 || index >= size) {
                System.out.println("Invalid argument");
                System.out.println(-1);
            } else if(index == 0) {
                removeFirst();
            } else if(index == size - 1) {
                removeLast();
            } else {
                Node node = head;
                for(int i = 0; i < index - 1; ++i) {
                    node = node.next;
                }
                int dataToRemove = node.next.data;
                node.next = node.next.next;
                System.out.println(dataToRemove);
                --size;
            }
        }

        void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else if(size == 1) {
                int dataToRemove = head.data;
                head = tail = null;
                --size;
                System.out.println(dataToRemove);
            } else {
                int dataToRemove = head.data;
                head = head.next;
                --size;
                System.out.println(dataToRemove);
            }
        }

        void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
                System.out.println(-1);
            } else if(size == 1) {
                int dataToRemove = head.data;
                head = tail = null;
                --size;
                System.out.println(dataToRemove);
            } else {
                int dataToRemove = tail.data;
                Node node = head;
                for(int i = 0; i < size-2; ++i) {
                    node = node.next;
                }
                node.next = null;
                tail = node;
                --size;
                System.out.println(dataToRemove);
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

                switch(action) {
                    case "add":
                        int value = Integer.parseInt(parts[1]);
                        linkedList.addLast(value);
                        break;
                    case "remove":
                        int index = Integer.parseInt(parts[1]);
                        linkedList.removeAt(index);
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