import java.util.Scanner;

/**
 * Created by Rohan on 26/09/16.
 */
public class LetsReview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n >= 1) && (n <= 10)) {

            for (int i = 0; i <= n; i++) {
                String s = sc.next();
                StringBuilder even = new StringBuilder();
                StringBuilder odd = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    if(j%2==0){
                        even.append(s.charAt(j));
                    }else{
                        odd.append(s.charAt(j));
                    }
                }
                System.out.print(even + " " + odd + "\n");
            }
        }

    }

}
