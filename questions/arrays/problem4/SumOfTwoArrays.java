import java.util.Scanner;

public class SumOfTwoArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // accept elements of array 1
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i < n1; ++i) {
            a1[i] = scanner.nextInt();
        }

        // accept elements of array 2
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0; i < n2; ++i) {
            a2[i] = scanner.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;

        int carry = 0;
        while(k >= 0) {
            int d = carry;

            if(i >= 0) {
                d += a1[i];
            }

            if(j >= 0) {
                d += a2[j];
            }

            carry = d / 10;
            sum[k] = d % 10;

            --i;
            --j;
            --k;
        }

        if(carry != 0) {
            System.out.println(carry);
        }
        for(k = 0; k < sum.length; ++k) {
            System.out.println(sum[k]);
        }
    }
}