public class Practical_07a {
    public static void main(String[] args) {
        try {
            int x = 1000000000; // Example values, you can change these
            int y = 5; // Change the value of y to test different scenarios
            System.out.println(divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static int divide(int x, int y) {
        // Check if x and y are 32-bit signed integers
        if (x != (int) x || y != (int) y) {
            throw new ArithmeticException("Input values must be 32-bit signed integers.");
        }
        
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x / y;
    }
}
