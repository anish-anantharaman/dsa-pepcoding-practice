import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int st = n;
        int sp = 0;

        for(int i = 1; i <= n; ++i) {
            for(int k = 1; k <= sp; ++k) {
                System.out.print("\t");
            }

            for(int j = 1; j<= st; ++j) {
                System.out.print("*\t");
            }

            --st;
            ++sp;
            System.out.println();
        }
    }
}