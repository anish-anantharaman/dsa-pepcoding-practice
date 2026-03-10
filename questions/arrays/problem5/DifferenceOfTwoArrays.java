import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        int[] a1 = new int[n1];
        for(int i = 0; i < n1; ++i) {
            a1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();

        int[] a2 = new int[n2];
        for(int i = 0; i < n2; ++i) {
            a2[i] = scanner.nextInt();
        }

        int i = n1 - 1;
        int j = n2 - 1;
        int k = j;

        int[] diff = new int[k + 1];
        int borrow = 0;

        while(k >= 0) {
            int a1val = i >= 0 ? a1[i] : 0;

            a2[j] += borrow;
            borrow = 0;

            if(a2[j] < a1val) {
                a2[j] += 10;
                borrow = -1;
            }
            diff[j] = a2[j] - a1val;

            --i;
            --j;
            --k;
        }

        // loop to prevent printing of prefixed zero values in the array
        int idx = 0;
        while(idx < diff.length) {
            if(diff[idx] == 0) {
                ++idx;
            } else {
                break;
            }
        }
        while(idx < diff.length) {
            System.out.print(diff[idx]);
            ++idx;
        }
        System.out.println();
    }
}