import java.util.Scanner;

public class Arithmetic {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("First we are going to run the installment method.");
//        installment();
//
//        System.out.println("Next we are going to run the Triangle area method.");
//        triangle();

        System.out.println("Temperature Converter.");
        temperature();
    }

    public static void temperature() {
        double cels, farn;

        System.out.print("Enter temperature in celsius: ");
        cels = input.nextDouble();

        farn = 1.8 * cels + 32;

        System.out.print("Fahrenheit Output =" + farn);
    }

    public static void installment() {
        int phonePrice = 1800;
        int numberOfInstallment, installmentPerMonth;

        System.out.print("Number of installments? ");
        numberOfInstallment = input.nextInt();
        installmentPerMonth = phonePrice / numberOfInstallment;

        System.out.println("Installments per month: " + installmentPerMonth);
    }

    public static void triangle() {
        double base, height, area;
        System.out.print("Enter base :");
        base = input.nextDouble();
        System.out.print("Enter height :");
        height = input.nextDouble();

        area = 0.5 * base * height;

        System.out.print("The out for the triangle is : " + area);
    }
}

