import java.io.*;
import java.lang.*;
import java.util.Stack;

public class PostfixPrefixConversion {

    public static void main(String[] args) {

        String expression = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            expression = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); ++i) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if ((ch >= '0' && ch <= '9')
                    || (ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + ""); // adding "" makes it as a string instead of char
            } else if(ch == ')') {

                while(operators.peek() != '(') {
                    processStack(prefix, postfix, operators.pop());
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty()
                        && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {

                    processStack(prefix, postfix, operators.pop());
                }
                operators.push(ch);
            }
        }

        while(!operators.isEmpty()) {
            processStack(prefix, postfix, operators.pop());
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    private static void processStack(Stack<String> prefix, Stack<String> postfix, char operator) {
            String postv2 = postfix.pop();
            String postv1 = postfix.pop();
            String postv = postv1 + postv2 + operator;
            postfix.push(postv);

            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            String prev = operator + prev1 + prev2;
            prefix.push(prev);
    }

    private static int precedence(char operator) {
        return switch(operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> throw new IllegalArgumentException("Invalid operator for precedence");
        };
    }
}