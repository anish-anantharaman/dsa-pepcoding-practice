import java.util.Scanner;
import java.util.Stack;
import java.io.*;
import java.lang.Exception;

public class InfixEvaluation {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            String expression = bufferedReader.readLine();


            Stack<Integer> operands = new Stack<>();
            Stack<Character> operators = new Stack<>();

            for (int i = 0; i < expression.length(); ++i) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    operators.push(ch);
                } else if (Character.isDigit(ch)) {
                    // converts ch of char type to int using ASCII value difference calculation,
                    // works only for single digits, here single digit is a constraint, hence we can use this approach.
                    operands.push(ch - '0');
                } else if (ch == ')') {

                    while (operators.peek() != '(') {
                        char operator = operators.pop();
                        int v2 = operands.pop();
                        int v1 = operands.pop();
                        int res = operation(v1, v2, operator);
                        operands.push(res);
                    }
                    operators.pop(); // pops the element '('
                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                    // ch is wanting to higher priority operators to solve first
                    while (!operators.isEmpty() && operators.peek() != '('
                            && precedence(ch) <= precedence(operators.peek())) {
                        char operator = operators.pop();
                        int v2 = operands.pop();
                        int v1 = operands.pop();
                        int res = operation(v1, v2, operator);
                        operands.push(res);
                    }

                    // ch is pushing itself now
                    operators.push(ch);
                }
            }


            while (!operators.isEmpty()) {
                char operator = operators.pop();
                int v2 = operands.pop();
                int v1 = operands.pop();
                int res = operation(v1, v2, operator);
                operands.push(res);
            }
            System.out.println(operands.peek());
        } catch(IOException e) {
            throw new RuntimeException("Error in BufferedReader");
        }
    }

    private static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> throw new IllegalArgumentException("Invalid operator for precedence");
        };
    }

    private static int operation(int v1, int v2, char operator) {
        return switch(operator) {
            case '+' -> v1 + v2;
            case '-' -> v1 - v2;
            case '*' -> v1 * v2;
            case '/' -> v1 / v2;
            default -> throw new IllegalArgumentException("Illegal operator for calculation");
        };
    }
}