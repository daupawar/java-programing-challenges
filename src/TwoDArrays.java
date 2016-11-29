import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rohan on 14/07/16.
 */
public class TwoDArrays {

    void calculateMaxSum() {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sum[] = new int[16];
        int max = -64, temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temp > max){
                    max = temp;
                }
            }
        }
        Arrays.sort(sum);
        System.out.println(max);
    }
}
