import java.util.Scanner;

/**
 * Created by Rohan on 16/11/16.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int rot = k % n;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for (int a0 = 0; a0 < q; a0++) {
            int idx = in.nextInt();
            if (idx - rot >= 0) {
                System.out.println(a[idx - rot]);
            }
            else {
                System.out.println(a[idx - rot + a.length]);
            }

        }


    }
}
