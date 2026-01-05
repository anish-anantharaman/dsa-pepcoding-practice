import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for(int div = 2; div <= Math.sqrt(n); ++div) {
            while(n % div == 0) {
               n /= div;
               System.out.println(div);
            }
        }

        if(n != 1) {
            System.out.println(n);
        }

    }
}