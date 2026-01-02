import java.util.Scanner;

public class FibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 0; i < n; ++i) {
            System.out.println(firstNumber);
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

    }
}