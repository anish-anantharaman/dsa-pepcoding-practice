import java.util.Scanner;

public class SpanOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < n; ++i) {

            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}