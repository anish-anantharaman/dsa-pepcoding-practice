import java.util.Scanner;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


        int temp = n;
        int count = 0;

        // count of digits
        while(temp != 0) {
            temp /= 10;
            ++count;
        }

        k %= count;
        if(k < 0) {
            k += count;
        }

        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, (count-k));


        int reminder = n % divisor;
        int quotient = n / divisor;
        int newNumber = quotient + (reminder * multiplier);
        System.out.println(newNumber);
    }
}