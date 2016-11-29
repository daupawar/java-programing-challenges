
import java.util.Scanner;

/**
 * Created by Rohan on 05/07/16.
 */
public class PlusMinus {

    public void plusMinus(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        double nonNegative=0;
        double negative=0;
        double zeros=0;
        for(int i=0;i<n;i++){

            int val=a[i];

            if(val<0){
                ++negative;
            }else if(val>0){
                ++nonNegative;
            }else {
                ++zeros;
            }
        }

        double positive=nonNegative/n;
        double nonPositive=negative/n;
        double zero=zeros/n;

        System.out.println(positive+"");
        System.out.println(nonPositive+"");
        System.out.println(zero+"");
    }
}
