import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Getting Details from user.
        System.out.println("Enter the number of days delayed: ");
        int daysCount = scan.nextInt();
        double fineAmount = 0;

        if (daysCount > 5) {
            int remainingDay = daysCount - 5 ;

        // Fine Calculation greater than 5 days.
            fineAmount = (2 * 5) + (remainingDay * 5);
        }
        else {
            fineAmount = daysCount * 2;
        }
        System.out.println("The fine amount is: Rs." + fineAmount);
        scan.close();
    }
}
