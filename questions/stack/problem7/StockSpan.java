import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int[] stockSpan = new int[n];
        stockSpan = solveStockSpan(a);

        for(int i : stockSpan) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solveStockSpan(int[] a) {

        Stack<Integer> stack = new Stack<>();
        int n = a.length;
        int[] stockSpan = new int[n];
        stockSpan[0] = 1;
        stack.push(0);

        for(int i = 1; i < n; ++i) {
            while(stack.size() != 0 &&
                    a[stack.peek()] <= a[i]) {
                stack.pop();
            }

            if(stack.size() == 0) {
                stockSpan[i] = i + 1;
            } else {
                stockSpan[i] = i - stack.peek();
            }
            stack.push(i);

        }
        return  stockSpan;
    }
}