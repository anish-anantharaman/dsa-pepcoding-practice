import java.util.Stack;
import java.io.*;
import java.lang.*;

public class PostfixEvaluationConversion {

    public static void main(String[] args) {

        String expression = null;
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(System.in));
            expression = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error in bufferedreader");
        }


        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();

        for(int i = 0; i < expression.length(); ++i) {

            char ch = expression.charAt(i);

            if(Character.isDigit(ch)) {
                valueStack.push(ch - '0');
                infixStack.push(ch + "");
                prefixStack.push(ch + "");
            } else if(ch == '+' || ch == '-'
                    || ch == '*' || ch == '/') {

                int valueResult = calculateValueStack(valueStack.pop(),
                        valueStack.pop(), ch);
                String infixResult = calculateInfixStack(infixStack.pop(),
                        infixStack.pop(), ch);
                String prefixResult = calculatePrefixStack(prefixStack.pop(),
                        prefixStack.pop(), ch);

                valueStack.push(valueResult);
                infixStack.push(infixResult);
                prefixStack.push(prefixResult);
            }
        }

        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(prefixStack.pop());
    }

    private static int calculateValueStack(int operand1, int operand2, char operator) {
        return switch (operator) {
            case '+' -> operand2 + operand1;
            case '-' -> operand2 - operand1;
            case '*' -> operand2 * operand1;
            case '/' -> operand2 / operand1;
            default -> throw new IllegalArgumentException("Unknown operator");
        };
    }

    private static String calculateInfixStack(String operand1,
                                              String operand2, char operator) {
        StringBuilder sb = new StringBuilder();
        sb.append('(')
                .append(operand2)
                .append(operator)
                .append(operand1)
                .append(')');
        return String.valueOf(sb);
    }

    private static String calculatePrefixStack(String operand1,
                                               String operand2, char operator) {
        StringBuilder sb = new StringBuilder();
        sb.append(operator)
                .append(operand2)
                .append(operand1);
        return String.valueOf(sb);
    }
}