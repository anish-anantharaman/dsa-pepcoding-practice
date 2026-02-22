import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int power = 0;
        int res = 0;
        int carryForward = 0;

        while(n1 > 0 || n2 > 0 || carryForward > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            int sum = digit1 + digit2 + carryForward;
            int digitToAdd = sum % b;
            carryForward = sum / b;
            res += digitToAdd * Math.pow(10, power);
            ++power;
            n1 /= 10;
            n2 /= 10;
        }
        System.out.println(res);
    }
}