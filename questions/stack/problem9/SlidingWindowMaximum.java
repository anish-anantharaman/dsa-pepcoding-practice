import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        int[] rb = new int[n];
        // similar to the approach to fetch right boundaries for Largest Area Histogram problem
        // (uses next smaller element indexes), except that  here we need to find the index of next greater element
        // for all the array elements
        rb = findRightBoundaries(a);
//        for(int i = 0; i < rb.length; ++i) {
//            System.out.print(a[rb[i]]);
//        }

        int j = 0;
        for(int i = 0; i <= a.length - k; i++) {
            // enter the loop to find the maximum of window starting at i
            if(j < i) {
                j = i;
            }
            while(rb[j] < i + k) {
                j = rb[j];
            }

            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    private static int[] findRightBoundaries(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int n = a.length;

        int[] rb = new int[n];
        for(int i = 0; i < n; ++i) {
            while(!stack.isEmpty() &&
                a[i] >= a[stack.peek()]) {
                rb[stack.pop()] = i;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            rb[stack.pop()] = n;
        }
        return rb;
    }



}