import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                boolean isValid = handleBrackets(stack, '(');
                if(isValid == false) {
                    System.out.println(isValid);
                    return;
                }
            } else if(ch == '}') {
                boolean isValid = handleBrackets(stack, '{');
                if(isValid == false) {
                    System.out.println(isValid);
                    return;
                }
            } else if(ch == ']') {
                boolean isValid = handleBrackets(stack, '[');
                if(isValid == false) {
                    System.out.println(isValid);
                    return;
                }
            }
        }

        if(stack.size() != 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public static boolean handleBrackets(Stack<Character> stack, char ch) {
        if(stack.size() == 0) {
            return false;
        } else if(stack.peek() != ch) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}