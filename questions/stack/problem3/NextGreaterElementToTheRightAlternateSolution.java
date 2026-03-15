import java.util.Scanner;
import java.util.Stack;

/**
 * This is an alternative approach to solve the problem of next
 * greater element to the right
 */
public class NextGreaterElementToTheRightAlternateSolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];
        b = solveNextGreaterElement(a);

        for(int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solveNextGreaterElement(int[] a) {

        int[] b = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // push index of the first element


        for(int i = 1; i < a.length; ++i) {
            while((stack.size() != 0) &&
                    (a[stack.peek()] < a[i])) {
                b[stack.peek()] = a[i];
                stack.pop();
            }
            stack.push(i);
        }

        while(stack.size() != 0) {
            b[stack.peek()] = -1;
            stack.pop();
        }

        return b;
    }
}