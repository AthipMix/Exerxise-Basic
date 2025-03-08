package Basic;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter Third Number : ");
        int number3 = scanner.nextInt();
        double Average = (number1 + number2 + number3) / 3.0;
        System.out.println("The Average of 3 numbers is : "+Average);
        scanner.close();
    }
}
