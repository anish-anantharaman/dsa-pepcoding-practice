import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Solution 1
//        for(int i = 1; i <= n; ++i) {
//            for(int j = 1; j <= (n-i); ++j) {
//                System.out.print("\t");
//            }
//            System.out.println("*");
//        }

        // Solution 2
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <=n; ++j) {
                if((i+j) == (n+1)) {
                    System.out.print("*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}