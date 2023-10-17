/**
 * A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward
 * (ignoring spaces, punctuation, and capitalization).
 */

class Palindrome {
    public static void main(String[] args) {
        String input = "okko";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}