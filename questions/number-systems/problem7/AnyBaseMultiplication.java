import java.util.Scanner;

public class AnyBaseMultiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int res = getProduct(b, n1, n2);
        System.out.println(res);
    }

    public static int getProduct(int b, int n1, int n2) {
        int res = 0;
        int power = 0;
        while(n2 > 0) {
            int digit2 = n2 % 10;
            n2 /= 10;
            int partialProduct = getProductWithSingleDigit(b, n1, digit2) * (int) Math.pow(10, power);
            ++power;
            res = getSum(b, res, partialProduct);
        }
        return res;
    }

    public static int getProductWithSingleDigit(int b, int n1, int digit2) {
        int res = 0;
        int carryForward = 0;
        int power = 0;

        while(n1 > 0 || carryForward > 0) {
            int digit1 = n1 % 10;
            n1 /= 10;
            int product = (digit1 * digit2) + carryForward;

            carryForward = product / b;
            product %= b;

            res += product * Math.pow(10, power);
            ++power;
        }
        return res;
    }

    public static int getSum(int b, int n1, int n2) {
        int carryForward = 0;
        int sum = 0;
        int power = 0;
        int res = 0;
        int digitSum = 0;

        while(n1 > 0 || n2 > 0 || carryForward > 0) {

            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            digitSum = digit1 + digit2 + carryForward;
            carryForward = digitSum / b;
            sum = digitSum % b;

            res += (sum * Math.pow(10, power));

            ++power;
            n1 /= 10;
            n2 /= 10;
        }
        return res;
    }
}