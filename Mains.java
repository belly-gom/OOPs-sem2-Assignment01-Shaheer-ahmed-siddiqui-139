import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        cal.setNumbers(numbers);

        System.out.println("\n1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");

        System.out.print("Choose an operation: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                cal.add();
                cal.show();
                break;

            case 2:
                cal.subtract();
                cal.show();
                break;

            case 3:
                cal.multiply();
                cal.show();
                break;

            case 4:
                cal.divide();
                cal.show();
                break;

            case 5:
                cal.squareRoot();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        input.close();
    }
}