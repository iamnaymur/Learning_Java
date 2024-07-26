//import java.util.Scanner;
//
//public class userInput {
//    public static void main(String[] args) {
//        int number;
//        String name;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any number : ");
//        number = input.nextInt();
//
//        input.nextLine();
//        System.out.print("Enter your name : ");
//        name = input.nextLine();
//
//    //! The next method doesn't work when there is a gap in the string, so we have to use the nextLine method to solve the problem
//        System.out.println("Number :" + number);
//        System.out.println("Your name :" + name);
//    }
//}


/*
! Assignment -3 :
*/

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int id;
        float price;
        String title, description, category;
// Initializing the Scanner method
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the title: ");
        title = input.nextLine();
        System.out.print("Enter the ID: ");
        id = input.nextInt();
        System.out.print("Enter the price: ");
        price = input.nextFloat();
        input.nextLine();
        System.out.print("Enter the description: ");
        description = input.nextLine();
        System.out.print("Enter the category: ");
        category = input.nextLine();

        System.out.print("Print out from the Product Function: " + "\nPhone Id :" + id + "\nPhone title: " + title + "\nPhone price:" + price + "\nPhones description :" + description + "\nPhones Category : " + category + "\n");

    }
}