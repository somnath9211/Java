package function;

public class prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {

            isPrime = true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeRange(20);

    }
}
