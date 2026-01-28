import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sp = n/2;
        int st = 1;
        for(int i = 1; i <= n; ++i) {

            for (int j = 1; j <= sp; ++j) {
                if (i == (n + 1) / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for(int j = 1; j <= st; ++j) {
                System.out.print("*\t");
            }

            if(i <= n/2) {
                ++st;
            } else {
                --st;
            }
            System.out.println();
        }
    }
}