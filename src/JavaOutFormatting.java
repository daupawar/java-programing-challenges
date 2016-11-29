import java.util.Scanner;

/**
 * Created by Rohan on 26/08/16.
 */
public class JavaOutFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String lengthX = String.valueOf(x);
            if (lengthX.length() == 2) {
                lengthX = "0" + lengthX;
            } else if (lengthX.length() == 1) {
                lengthX = "00" + lengthX;
            } else if (lengthX.length() <= 0) {
                lengthX = "000";
            }
            String space = "";
            for (int j = 0; j < 15 - s1.length(); j++) {
                space += " ";
            }
            System.out.println(s1 + space + lengthX);
            //Complete this line
        }
        System.out.println("================================");

    }
}
