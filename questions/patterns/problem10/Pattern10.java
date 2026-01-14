import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int os = n/2;
        int is = -1;

        for(int i = 1; i <= n; ++i) {

            // print for outer space in each row
            for(int j = 1; j <= os; ++j) {
                System.out.print("\t");
            }

            // print first star
            System.out.print("*\t");

            // print for inner space in each row
            for(int j = 1; j <= is; ++j) {
                System.out.print("\t");
            }

            if(is != -1) {
                // you can also do the same condition with i > 1 && i <= n, print *
                System.out.print("*");
            }

            if(i <=n/2) {
                --os;
                is+=2;
            } else {
                ++os;
                is-=2;
            }

            System.out.println();
        }
    }
}