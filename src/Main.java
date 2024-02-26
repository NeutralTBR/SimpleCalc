import java.util.Scanner;
public class Main {

    static void showTitleNTotal(float total) {
        System.out.println("Calculator");
        System.out.println("============");
        System.out.println("Total = " + total + "\n");
    }

    static void showOps() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Clear Total");
        System.out.println("7. Exit");
        System.out.print("Operator [1...7]: ");
    }

    public static void main(String[] args) {
        float total, value1, value2;
        total = 0;
        value1 = 0;
        value2 = 0;
        int inputOp, runState, isDone;
        isDone = 0;

        runState = 1;
        Scanner input = new Scanner(System.in);

        showTitleNTotal(total);

        System.out.print("Input number : ");
        value1 = input.nextFloat();

        showOps();
        inputOp = input.nextInt();

        System.out.print("Input number : ");
        value2 = input.nextFloat();

        switch (inputOp) {
            case 1:
                total = value1 + value2;
                value1 = total;
                runState = 2;
                break;
            case 2:
                total = value1 - value2;
                value1 = total;
                runState = 2;
                break;
            case 3:
                total = value1 * value2;
                value1 = total;
                runState = 2;
                break;
            case 4:
                total = value1 / value2;
                value1 = total;
                runState = 2;
                break;
            case 5:
                total = value1 % value2;
                value1 = total;
                runState = 2;
                break;
            case 6:
                total = 0;
                runState = 1;
//                showTitleNTotal(total);
                break;
            case 7:
                isDone = 1;
                System.exit(0);
            default:
                System.out.println("Input must be number between 1-7");
        }
        while (isDone == 0) {
            showTitleNTotal(total);

            if (runState == 1) {
                System.out.print("Input number : ");
                value1 = input.nextFloat();
                showOps();
                inputOp = input.nextInt();
            } else if (runState == 2) {
                showOps();
                inputOp = input.nextInt();
            }
            System.out.print("Input number : ");
            value2 = input.nextFloat();

            switch (inputOp) {
                case 1:
                    total = value1 + value2;
                    value1 = total;
                    runState = 2;
                    break;
                case 2:
                    total = value1 - value2;
                    value1 = total;
                    runState = 2;
                    break;
                case 3:
                    total = value1 * value2;
                    value1 = total;
                    runState = 2;
                    break;
                case 4:
                    total = value1 / value2;
                    value1 = total;
                    runState = 2;
                    break;
                case 5:
                    total = value1 % value2;
                    value1 = total;
                    runState = 2;
                    break;
                case 6:
                    total = 0;
                    runState = 1;
                    break;
                case 7:
                    isDone = 1;
                    System.exit(0);
                default:
                    System.out.println("Input must be number between 1-7");
            }
        }
    }
}