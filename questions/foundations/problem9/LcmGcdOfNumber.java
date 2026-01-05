import java.util.Scanner;
public class LcmGcdOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;
        int gcd;
        int lcm;

        // find the gcd of the two numbers with division method
        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num2;

        // find lcm with the mathematical formula
        // lcm * gcd = product of both numbers
        lcm = (originalNum1 * originalNum2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}