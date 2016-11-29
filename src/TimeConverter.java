import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Rohan on 10/11/16.
 */
public class TimeConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String[] splited = time.split(":");
        int hh = Integer.parseInt(splited[0]);
        int mm = Integer.parseInt(splited[1]);
        int ss = Integer.parseInt(splited[2].substring(0, 2));

        String SS = splited[2];
        String ampmc = Character.toString(SS.charAt(2));
        if (1 <= hh && hh <= 12) {
            if (ampmc.equalsIgnoreCase("p") && hh != 12) {
                hh += 12;
            } else if (ampmc.equalsIgnoreCase("a") && hh == 12) {
                hh =0;
            }
        }
        if (!(0 <= mm && mm <= 59)) {
            mm = 0;
        }
        if (!(0 <= ss && ss <= 59)) {
            ss = 0;
        }
        String format = String.format(Locale.getDefault(), "%02d:%02d:%02d", hh, mm, ss);
        System.out.println(format);
    }
}
