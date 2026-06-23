import java.util.*;
import java.io.*;

public class ReverseLinkedListPointerIterative {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;


        void add(int value) {
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

        void reverse() {
            Node prev = null;
            Node current = head;
            tail = head;

            while(current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
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
            while (!"quit".equals(action)) {
                switch (action) {
                    case "add":
                        int value = Integer.parseInt(parts[1]);
                        linkedList.add(value);
                        break;
                    case "reverse":
                        linkedList.reverse();
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