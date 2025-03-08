package Basic;
import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Centimeter: ");
        double cm = scanner.nextDouble();
        double inch = cm / 2.54;
        System.out.println(cm + " cm is equal to " + inch + " inches.");

        scanner.close();
    }    
}
