import java.util.Scanner;

/**
 * Created by Rohan on 11/07/16.
 */
public class SavePrisoner {

    public void savePrisoner() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;

        /**
         * pass
         */
//        for(int i=0;i<n;i++){
//
//            int prisoners=scan.nextInt();
//            int sweets=scan.nextInt();
//            int startId=scan.nextInt();
//
//            k=(startId+sweets)%prisoners;
//
//            if(k-1==0)
//            {
//                System.out.println(prisoners+"");
//            }
//            else
//            {
//                System.out.println(k-1+"");
//            }
//        }


        /**
         * fail
         */
//        for(int i=0;i<n;i++){
//
//            int prisoners=scan.nextInt();
//            int sweets=scan.nextInt();
//            int startId=scan.nextInt();
//
//            k=sweets%prisoners;
//            startId -=1;
//            k=k+startId;
//            System.out.println(k+"");
//        }

        /**
         * pass
         */
        for (int i = 0; i < n; i++) {

            int prisoners = scan.nextInt();
            int sweets = scan.nextInt();
            int startId = scan.nextInt();

            while (sweets > 0) {

                k = startId;
                sweets--;
                if (prisoners == startId) {
                    startId = 1;
                } else {
                    startId++;
                }
            }
        }
        System.out.println(k + "");
    }
}
