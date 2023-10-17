import java.util.stream.IntStream;

/**
 * Calculating the factorial of a number is a common programming exercise in Java. The factorial of a non-negative
 * integer "n" is the product of all positive integers from 1 to "n."
 * <p>
 * It is the number to calculate factorial => 5! = 5*4*3*2*1 = 120
 */
public class Factorial {
    public static void main(String args[]) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static int factorial(int n) {
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;

        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}