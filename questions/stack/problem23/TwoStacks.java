import java.util.Scanner;

public class TwoStacks {

    public static class TwoStack {

        int[] data;
        int tos1;
        int tos2;

        TwoStack(int cap) {
            data = new int[cap];
            tos1 = -1;
            tos2 = cap;
        }

        void push1(int n) {

            if(tos1 + 1 == tos2) {
                System.out.println("Stack overflow");
                return;
            }

            ++tos1;
            data[tos1] = n;
        }

        void push2(int n) {

            if(tos1 + 1 == tos2) {
                System.out.println("Stack overflow");
                return;
            }

            --tos2;
            data[tos2] = n;
        }

        int size1() {
            return tos1 + 1;
        }

        int size2() {
            return data.length - tos2;
        }

        int top1() {
            if(size1() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return data[tos1];
        }

        int top2() {
            if(size2() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return data[tos2];
        }

        int pop1() {
            if(size1() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = data[tos1];
            --tos1;
            return val;
        }

        int pop2() {
            if(size2() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = data[tos2];
            ++tos2;
            return val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap = scanner.nextInt();

        TwoStack stack = new TwoStack(cap);
        String action = scanner.next();
        int val;

        while(!"quit".equals(action)) {
            switch (action) {
                case "push1":
                    val = scanner.nextInt();
                    stack.push1(val);
                    break;
                case "push2":
                    val = scanner.nextInt();
                    stack.push2(val);
                    break;
                case "size1":
                    System.out.println(stack.size1());
                    break;
                case "size2":
                    System.out.println(stack.size2());
                    break;
                case "top1":
                    System.out.println(stack.top1());
                    break;
                case "top2":
                    System.out.println(stack.top2());
                    break;
                case "pop1":
                    System.out.println(stack.pop1());
                    break;
                case "pop2":
                    System.out.println(stack.pop2());
                    break;
                default:
                    throw new RuntimeException("invalid action value");
            }
            action = scanner.next();
        }
    }
}