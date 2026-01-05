import java.util.Scanner;

public class PrintDigitsOfNumberLeftToRight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 0) {
            int digit = n % 10;
            n /= 10;
            System.out.println(digit);
        }
    }

}