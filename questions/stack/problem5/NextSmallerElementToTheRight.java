import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementToTheRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];
        b = solveNextSmallerElementToTheRight(a);

        for(int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solveNextSmallerElementToTheRight(int[] a) {
        int n = a.length;
        int[] b = new int[n];

        Stack<Integer> stack = new Stack<>();
        b[n-1] = -1;
        stack.push(a[n-1]);

        for(int i = n-2; i >= 0; --i) {
            while(stack.size() != 0 &&
                a[i] <= stack.peek()) {
                stack.pop();
            }

            if(stack.size() == 0) {
                b[i] = -1;
            } else {
                b[i] = stack.peek();
            }
            stack.push(a[i]);
        }
        return b;
    }
}