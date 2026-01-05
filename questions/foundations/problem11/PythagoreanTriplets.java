import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean flag = false;

        int largest = a;
        if(b > largest) {
            largest = b;
        }
        if(c > largest) {
            largest = c;
        }

        if(largest == a) {
            flag = ((a * a) == ((b * b) + (c * c)));
        } else if(largest == b) {
            flag = ((b * b) == ((a * a) + (c * c)));
        } else {
            flag = ((c * c) == ((a * a) + (b * b)));
        }
        System.out.println(flag);
    }
}