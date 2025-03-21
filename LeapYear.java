package Basic;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is a leap year: " + isLeapYear);

        scanner.close();
    }
}
