import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rohan on 28/09/16.
 */
public class Regexer {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list=new ArrayList<>();

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(emailID.endsWith("@gmail.com")){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String aList : list) {
            if (aList != null) {
                System.out.println(aList);
            }
        }

    }
}
