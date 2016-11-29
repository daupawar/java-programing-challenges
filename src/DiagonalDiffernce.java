import java.util.Scanner;

/**
 * Created by Rohan on 05/07/16.
 */
public class DiagonalDiffernce {

    public void diagonalDiffernce(){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int a[][] = new int[n][n];
        int sum1 = 0;
        int sum2 = 0;

        /**
         * attemp one
         */
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//                int curInput = scan.nextInt();
//                if (i == j) {
//                    sum1 += curInput;
//                }
//                if (i + j == (n - 1)) {
//                    sum2 += curInput;
//                }
//            }
//        }

        /**
         * atempt two
         */
//        for (int currentOne = 0, currentTwo = n - 1;
//             currentOne < n;
//             currentOne++, currentTwo--) {
//
//            String[] inputLine = scan.nextLine().split(" ");
//
//            sum1 = sum1
//                    + Integer.parseInt(inputLine[currentOne]);
//            sum2 = sum2
//                    + Integer.parseInt(inputLine[currentTwo]);
//        }

        /**
         * attempt three
         */
        for (int a_i = 0; a_i < n; a_i++) {

            for (int a_j = 0; a_j < n; a_j++) {

                a[a_i][a_j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum1 += a[i][i];
            sum2 += a[i][n - 1 - i];
        }


        /**
         *  print result
         */
        System.out.println(Math.abs(sum1 - sum2));
    }
}
