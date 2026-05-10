import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern {

    public static void main(String[] args) {

        String expression = null;

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            expression = br.readLine();
        } catch(IOException e) {
            throw new RuntimeException("Error in bufferedreader");
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for(int i = 0; i < expression.length(); ++i) {
            char ch = expression.charAt(i);

            if(ch == 'd') {
                stack.push(num);
                ++num;
            } else {
                stack.push(num);
                ++num;

                while(!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }
        }

        stack.push(num);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}