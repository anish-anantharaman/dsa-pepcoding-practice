import java.util.Scanner;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int power = 0;
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            res += digit * Math.pow(b, power);
            ++power;
            n /= 10;
        }

        System.out.println(res);
    }
}