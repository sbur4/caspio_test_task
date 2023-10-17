class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}