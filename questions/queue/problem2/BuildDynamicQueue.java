import java.util.*;
import java.io.*;

public class BuildDynamicQueue {

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        CustomQueue(int n) {
           data = new int[n];
           front = 0;
           size = 0;
        }

        void add(int val) {
            if(data.length == size) {
                int[] newArr = new int[data.length * 2];
                for(int i = 0; i < size; ++i) {
                    int index = (i + front) % data.length;
                    newArr[i] = data[index];
                }
                data = newArr;
                front = 0;
            }
            int rear = (front + size) % data.length;
            data[rear] = val;
            ++size;

        }

        void remove() {
            if(size == 0) {
                System.out.println("Queue underflow");
                System.out.println(-1);
            } else {
                System.out.println(data[front]);
                front = (front + 1) % data.length;
                --size;
            }
        }

        void peek() {
            if(size == 0) {
                System.out.println("Queue underflow");
                System.out.println(-1);
            } else {
                System.out.println(data[front]);
            }
        }

        void size() {
            System.out.println(size);
        }

        void display() {
            if(size == 0) {
                System.out.println("Queue underflow");
                System.out.println(-1);
            } else {
                for(int i = 0; i < size; ++i) {
                    int index = (front + i) % data.length;
                    System.out.print(data[index] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            int n = Integer.parseInt(br.readLine());
            CustomQueue customQueue = new CustomQueue(n);

            String[] parts = br.readLine().split(" ");
            String action = parts[0];
            int value;

            while(!"quit".equals(action)) {
                switch (action) {
                    case "add":
                        value = Integer.parseInt(parts[1]);
                        customQueue.add(value);
                        break;
                    case "remove":
                        customQueue.remove();
                        break;
                    case "peek":
                        customQueue.peek();
                        break;
                    case "size":
                        customQueue.size();
                        break;
                    case "display":
                        customQueue.display();
                        break;
                    default:
                        System.out.println("Invalid action value");
                }
                parts = br.readLine().split(" ");
                action = parts[0];
            }
        } catch (IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}