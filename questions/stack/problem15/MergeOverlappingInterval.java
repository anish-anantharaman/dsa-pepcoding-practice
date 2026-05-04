import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;


public class MergeOverlappingInterval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[][] = new int[n][2];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < 2; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }

        mergeOverlappingIntervals(a);
    }

    public static void mergeOverlappingIntervals(int[][] a) {

        Pair[] pairs = new Pair[a.length];

        for(int i = 0; i < a.length; ++i) {
            pairs[i] = new Pair(a[i][0], a[i][1]);
        }
        Arrays.sort(pairs);

        Stack<Pair> stack = new Stack<>();
        for(int i = 0; i < pairs.length; ++i) {
            if(i == 0) {
                stack.push(pairs[i]);
            } else {
                Pair top = stack.peek();
                if(pairs[i].startTime > top.endTime) {
                    stack.push(pairs[i]);
                } else {
                    top.endTime = Math.max(top.endTime, pairs[i].endTime);
                }
            }
        }

        Stack<Pair> resultStack = new Stack<>();
        while(!stack.isEmpty()) {
            resultStack.push(stack.pop());
        }

        while(!resultStack.isEmpty()) {
            Pair pair = resultStack.pop();
            System.out.println(pair.startTime + " " + pair.endTime);
        }
    }

    public static class Pair implements Comparable<Pair>{
        int startTime;
        int endTime;

        Pair(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        // if this > val, return +ve
        // if this = val, return 0
        // if this < val, return -ve
        public int compareTo(Pair val) {
            if(this.startTime != val.startTime) {
                return this.startTime - val.startTime;
            } else {
                return this.endTime - val.endTime;
            }
        }
    }
}