import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToTheLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];
        b = solveNextGreaterElementToTheLeft(a);

        for(int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solveNextGreaterElementToTheLeft(int[] a) {

        Stack<Integer> stack = new Stack<>();
        int[] b = new int[a.length];
        b[0] = -1;
        stack.push(a[0]);

        for(int i = 1; i < a.length; ++i) {

            while(stack.size() > 0 &&
                    a[i] >= stack.peek()) {
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