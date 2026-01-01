import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count;

        for(int i = 0; i < t; ++i) {
            count = 0;
            int n = scanner.nextInt();
            for (int div = 2; div <= Math.sqrt(n); ++div) {
                if (n % div == 0) {
                    ++count;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        }
    }
}