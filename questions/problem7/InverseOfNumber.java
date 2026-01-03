import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inv = 0;
        int pos = 1;

        while(n != 0) {
            int digit = n % 10;
            inv += (int)(pos * Math.pow(10, digit-1));
            n /= 10;
            ++pos;
        }
        System.out.println(inv);
    }
}