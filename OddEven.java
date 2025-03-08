package Basic;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        if (number%2 == 0) {
            System.out.println("The number "+number+" is Even.");
        }else{
            System.out.println("The number "+number+" is Odd.");
        }
        
        scanner.close();
    }
}
