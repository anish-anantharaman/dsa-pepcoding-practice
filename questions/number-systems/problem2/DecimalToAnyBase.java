import java.util.Scanner;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int res = 0;
        int power = 0;
        while(n != 0) {
            int digit = n % b;
            res += (digit * Math.pow(10, power));
            ++power;
            n /= b;
        }
        System.out.println(res);
    }
}