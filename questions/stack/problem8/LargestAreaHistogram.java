import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        //  index of next smaller element on the right
        int[] rb = new int[a.length];
        rb = findRightBoundaries(a);

        //  index of next smaller element on the left
        int[] lb = new int[a.length];
        lb = findLeftBoundries(a);

        int maxArea = 0;
        for(int i = 0; i < a.length; ++i) {
            int width = rb[i] - lb[i] - 1;
            int area = a[i] * width;
            if(area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);
    }

    private static int[] findRightBoundaries(int[] a) {
        int n = a.length;
        int[]  rb = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && a[i] < a[stack.peek()]) {
                rb[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            rb[stack.pop()] = n;
        }

        return rb;
    }

    private static int[] findLeftBoundries(int[] a) {
        int n = a.length;
        int[] lb = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i >= 0; --i) {
            while(!stack.isEmpty() && a[i] < a[stack.peek()]) {
                lb[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            lb[stack.pop()] = -1;
        }
        return lb;
    }
}