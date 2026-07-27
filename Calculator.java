public class Calculator {

    // Attributes
    private double[] values;
    private double answer;

    // Store values
    public void assignValues(double[] values) {
        this.values = values;
    }

    // Addition
    public void calculateSum() {
        answer = 0;

        for (double value : values) {
            answer += value;
        }
    }

    // Subtraction
    public void calculateDifference() {
        answer = values[0];

        for (int i = 1; i < values.length; i++) {
            answer = answer - values[i];
        }
    }

    // Multiplication
    public void calculateProduct() {
        answer = 1;

        for (double value : values) {
            answer *= value;
        }
    }

    // Division
    public void calculateQuotient() {
        answer = values[0];

        for (int i = 1; i < values.length; i++) {

            if (values[i] == 0) {
                System.out.println("Division by zero is not allowed.");
                return;
            }

            answer /= values[i];
        }
    }

    // Square Root
    public void findSquareRoots() {

        System.out.println("\nSquare Root Results:");

        for (double value : values) {

            if (value >= 0) {
                System.out.println(value + " -> " + Math.sqrt(value));
            } else {
                System.out.println(value + " -> Invalid Input");
            }
        }
    }

    // Display Result
    public void displayResult() {
        System.out.println("Final Result = " + answer);
    }
}