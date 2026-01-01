import java.util.Scanner;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for(int num = low; num<= high; ++num) {
            int count = 0;
            for(int i = 2; i <= Math.sqrt(num); ++i) {
                if(num % i == 0) {
                    ++count;
                    break;
                }
            }

            if(count == 0) {
                System.out.println(num);
            }
        }
    }
}