import java.util.Scanner;

public class AnyBaseSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int borrow = 0;
        int power = 0;
        int res = 0;

        while(n1 > 0 || n2 > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            if(borrow != 0) {
                digit1 += borrow;
                borrow = 0;
            }

            if(digit1 < digit2) {
                borrow = -1;
                digit1 += b;
            }
            int difference = digit1 - digit2;
            res += difference * Math.pow(10, power);
            ++power;
        }
        System.out.println(res);
    }
}