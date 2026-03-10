import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take the input string
        String inputStr = scanner.nextLine();


        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);

            if(ch == ')') {
                if(stack.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while(stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        System.out.println(false);
    }
}