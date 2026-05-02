import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        // get the input data containing 0s and 1s
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }

        findCelebrity(a);
    }

    private static void findCelebrity(int[][] a) {

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < a.length; ++i) {
            stack.push(i);
        }

        while(stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            if(a[i][j] == 1) {
                // if i knows j -> i is not a celebrity
                stack.push(j);
            } else {
                // if i doesn't know j -> j is not a celebrity
                stack.push(i);
            }
        }

        int pot = stack.pop();
        for(int i = 0; i < a.length; ++i){
            if(i != pot) {
                if(a[pot][i] == 1 || a[i][pot] == 0) {
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}