import java.util.Scanner;
import java.util.Stack;
import java.lang.Character;


public class PrefixEvaluationConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();

        for(int i = expression.length() - 1; i >= 0; --i) {
            char ch = expression.charAt(i);
            if(Character.isDigit(ch)) {
                valueStack.push(ch - '0'); // subtract by '0' to convert it to integer type
                infixStack.push(ch + "");
                postfixStack.push(ch + "");

            } else if(ch == '+' || ch == '-'
                || ch == '*' || ch == '/') {

                int valueResult = calculateValueStack(valueStack.pop(),
                        valueStack.pop(), ch);
                String infixResult = calculateInfixStack(infixStack.pop(),
                        infixStack.pop(), ch);
                String postfixResult = calculatePostfixStack(postfixStack.pop(),
                        postfixStack.pop(), ch);

                valueStack.push(valueResult);
                infixStack.push(infixResult);
                postfixStack.push(postfixResult);
            }
        }


        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(postfixStack.pop());
    }

    private static int calculateValueStack(int operand1,
                                           int operand2, char operator) {
        return switch(operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> throw new IllegalArgumentException("Unknown operator");
        };
    }

    private static String calculateInfixStack(String operand1,
                                              String operand2, char operator) {
        StringBuilder sb = new StringBuilder();
        sb.append("(")
                .append(operand1)
                .append(operator)
                .append(operand2)
                .append(")");
        return String.valueOf(sb);
    }

    private static String calculatePostfixStack(String operand1,
                                                String operand2, char operator) {
        StringBuilder sb = new StringBuilder();
        sb.append(operand1)
                .append(operand2)
                .append(operator);
        return String.valueOf(sb);
    }
}