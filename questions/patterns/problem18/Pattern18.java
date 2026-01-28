import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sp = 0;
        int st = n;
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= sp; ++j) {
                System.out.print("\t");
            }

            for(int j = 1; j <= st; ++j) {
                if ((i <= n/2) &&  (i > 1) && (j > 1) && (j < st)) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }


            if(i <= n/2) {
                st-=2;
                ++sp;
            } else {
                st+=2;
                --sp;
            }

            System.out.println();
        }
    }
}