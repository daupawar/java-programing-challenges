import java.util.Scanner;

/**
 * Created by Rohan on 05/05/16.
 */
public class Alogrithm {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            try
            {
                int ans=power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }


    }

    static int power(int n,int p)throws Exception
    {
        if(n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n,p);
    }
}
