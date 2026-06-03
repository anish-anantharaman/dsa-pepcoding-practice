import java.util.*;
import java.io.*;

public class BuildNormalQueue {

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        void add(int val) {
            if(size == data.length) {
                System.out.println("Queue overflow");
            } else{
                int rear = (front + size) % data.length;
                data[rear] = val;
                ++size;
            }
        }

        void remove() {
            if(size == 0) {
                System.out.println("Queue underflow");
            } else {
                int val = data[front];
                front = (front + 1) % data.length;
                --size;
                System.out.println(val);
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
            for(int i = 0; i < size; ++i) {
                int index = (front + i) % data.length;
                System.out.print(data[index] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            int size = Integer.parseInt(br.readLine());
            CustomQueue customQueue = new CustomQueue(size);
            String[] parts = br.readLine().split(" ");
            String action = parts[0];
            while(!"quit".equals(action)) {
                switch (action) {
                    case "add":
                        int val = Integer.parseInt(parts[1]);
                        customQueue.add(val);
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
                        throw new RuntimeException("Invalid action value");
                }
                parts = br.readLine().split(" ");
                action = parts[0];            }
        } catch (IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }
}