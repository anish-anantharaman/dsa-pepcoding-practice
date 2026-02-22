import java.util.Scanner;

public class AsteriskBarChart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        // find the max value
        int max = a[0];
        for(int i = 1; i < n; ++i) {
            if(a[i] > max) {
                max = a[i];
            }
        }


        for(int i = max; i >= 1; --i) {
            for(int j = 0; j < n; ++j) {
                if(a[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}