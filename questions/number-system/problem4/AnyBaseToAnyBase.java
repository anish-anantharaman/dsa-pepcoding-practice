import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int result = convertToDecimal(n, b1);

        // if target base is already decimal, no need to call convertToTargetBase()
        if(b2 != 10) {
            result = convertToTargetBase(result, b2);
        }
        System.out.println(result);
    }

    public static int convertToDecimal(int number, int base) {
        int res = 0;
        int power = 0;
        while(number != 0) {
            int digit = number % 10;
            res += (digit * Math.pow(base, power));
            ++power;
            number /= 10;
        }
        return res;
    }

    public static int convertToTargetBase(int decimalValue, int base) {
        int res = 0;
        int power = 0;
        while(decimalValue != 0) {
            int digit = decimalValue % base;
            res += (digit * Math.pow(10, power));
            ++power;
            decimalValue /= base;
        }
        return res;
    }

}