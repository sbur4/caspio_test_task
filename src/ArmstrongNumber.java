/**
 * A number is called an Armstrong number if it is equal to the cube of its
 * every digit. For example, 153 is an Armstrong number because of 153= 1+
 * 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check
 * if the given number is Armstrong number or not.
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}