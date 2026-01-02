import java.util.Scanner;

public class PrintDigitsOfNumberRightToLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int count = 0;

        // count the number of digits
        while(temp != 0) {
            temp /= 10;
            ++count;
        }

        // print digits from left to right
        while(count != 0) {
            --count;
            int div = (int) Math.pow(10, count);
            int digit = (n / div);
            System.out.println(digit);
            n %= div;
        }
    }
}