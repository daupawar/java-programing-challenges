import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Rohan on 26/08/16.
 */
public class LibraryFine {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dayReturned = scan.nextInt();
        int monthReturned = scan.nextInt();
        int yearReturned = scan.nextInt();

        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();


        Calendar returnedCalender = Calendar.getInstance();
        returnedCalender.set(Calendar.DAY_OF_MONTH, dayReturned);
        returnedCalender.set(Calendar.MONTH, monthReturned);
        returnedCalender.set(Calendar.YEAR, yearReturned);

        Calendar expectedCalendar = Calendar.getInstance();
        expectedCalendar.set(Calendar.DAY_OF_MONTH, dayExpected);
        expectedCalendar.set(Calendar.MONTH, monthExpected);
        expectedCalendar.set(Calendar.YEAR, yearExpected);

        long fine = 0;
        if (returnedCalender.after(expectedCalendar)) {
            if (yearReturned == yearExpected) {
                if (monthExpected == monthReturned) {
                    long diffDays = dayReturned - dayExpected;
                    fine = diffDays * 15;
                } else {
                    long differenceMonths = monthReturned - monthExpected;
                    fine = differenceMonths * 500;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }


    private static boolean isValidDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        cal.setTime(date);
        try {
            cal.getTime();
            return true;
        } catch (Exception e) {
            System.out.println("Invalid date");
            return false;
        }
    }
}
