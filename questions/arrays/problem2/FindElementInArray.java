import java.util.Scanner;

public class FindElementInArray {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int index = -1;

        for(int i = 0; i < n; ++i) {
            if(a[i] == d) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}