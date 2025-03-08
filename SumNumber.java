package Basic;
import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = scanner.nextInt();
        int SumNumber;
        SumNumber = num1 + num2;
        System.out.println("The sum is : "+SumNumber);

        scanner.close();
    }
}
