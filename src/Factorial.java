/**
 * Created by Rohan on 20/07/16.
 */
public class Factorial {

    static int factorial(int n) {

        int result;
        if (n == 0 || n == 1) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }
}
