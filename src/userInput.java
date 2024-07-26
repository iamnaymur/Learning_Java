import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int number;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = input.nextInt();

        input.nextLine();
        System.out.print("Enter your name : ");
        name = input.nextLine();

    //! The next method doesnt work when there is a gap in the string, so we have to use the nextLine method to solve the problem
        System.out.println("Number :" + number);
        System.out.println("Your name :" + name);
    }
}
