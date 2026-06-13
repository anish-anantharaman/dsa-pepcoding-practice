import java.util.*;
import java.io.*;

public class LinkedListBasics {

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

        void size() {
            System.out.println(size);
        }

        void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                int dataToRemove = head.data;
                head = tail = null;
                size = 0;
                System.out.println(dataToRemove);
            } else {
                int dataToRemove = head.data; // store the current data for display
                head = head.next;
                --size;
                System.out.println(dataToRemove);
            }
        }
    }

    public static void main(String[] args) {
        try {
            LinkedList linkedList = new LinkedList();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            System.out.println("Enter elementa (type \'quit\' to stop)");
            String[] parts = br.readLine().split(" ");
            String action = parts[0];
            while (!"quit".equals(action)) {

                switch (action) {
                    case "add":
                        int val = Integer.parseInt(parts[1]);
                        linkedList.addLast(val);
                        break;
                    case "display":
                        linkedList.display();
                        break;
                    case "size":
                        linkedList.size();
                        break;
                    case "remove":
                        linkedList.removeFirst();
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