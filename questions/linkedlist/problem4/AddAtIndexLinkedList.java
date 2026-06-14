import java.util.*;
import java.io.*;

public class AddAtIndexLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addAt(int index, int value) {
            if(index < 0 || index > size) {
                System.out.println("Invalid argument");
                System.out.println(-1);
            } else if(index == 0) {
                addFirst(value);
            } else if(index == size) {
                addLast(value);
            } else {
                Node node = new Node();
                node.data = value;

                Node temp = head;
                for(int i = 0; i < index-1; ++i) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                ++size;
            }
        }

        void addFirst(int value) {
            Node node = new Node();
            node.data = value;
            node.next = head;
            head = node;
            if(size == 0) {
                tail = node;
            }
            ++size;
        }

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
                System.out.print(node.data  + " -> ");
                node = node.next;
            }
            System.out.println("NULL");
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
                        int index = Integer.parseInt(parts[1]);
                        int value = Integer.parseInt(parts[2]);
                        linkedList.addAt(index, value);
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
        } catch(IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}