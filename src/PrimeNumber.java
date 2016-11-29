import java.util.Scanner;

/**
 * Created by Rohan on 11/08/16.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int nextInt = sc.nextInt();
            boolean isPrime = isPrime(nextInt);
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        int i = 2;
        int nextToN = (int)Math.sqrt(1.0d * n);
        while((n % i) != 0 && i < nextToN) {
            i++;
        }
        return i >= nextToN;
    }
}
