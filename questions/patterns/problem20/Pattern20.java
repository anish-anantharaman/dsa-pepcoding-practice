import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mst = 1;
        int msp = 0;
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(j == 1 || j == n) {
                    System.out.print("*\t");
                } else if((i + j == n+1 || i == j) && i > n/2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}