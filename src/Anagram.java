import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x = "JAVA";
        String y = "AVAJ";

        if (areAnagrams(x, y)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        // Convert to lowercase and remove spaces
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}