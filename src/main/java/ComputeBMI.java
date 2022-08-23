import java.math.*;
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("(1/2) Enter Weight In Pounds: ");
        double weight = sc.nextDouble();

        System.out.println("(2/2) Enter Height In Inches: ");
        double height = sc.nextDouble();
        double bmi;
        bmi=weight/(height*height)*703;

        System.out.println("Your BMI Score: "+bmi);


        sc.close();
    }
}
