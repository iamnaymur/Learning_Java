package loopProgram;

import java.util.Scanner;

public class NumberPrograms {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        sumOfDigits();
//        reverseNumber();
//        findPalindrome();
//        ArmstrongNumber();
        validateUser();
    }

    //!    Sum of digits
    public static void sumOfDigits() {

        int sum = 0, remainder, temp, num;

        System.out.print("Enter the number: ");
        num = input.nextInt();

        for (temp = num; temp != 0; temp = temp / 10) {
            remainder = temp % 10;
            sum = sum + remainder;
        }
        System.out.print("Sum of digits is: " + sum);
    }

    //! Reverse number is
    public static void reverseNumber() {
        int sum = 0, remainder, temp, num;

        System.out.print("Enter the number: ");
        num = input.nextInt();

        for (temp = num; temp != 0; temp = temp / 10) {
            remainder = temp % 10;
            sum = sum * 10 + remainder;
        }
        System.out.print("The reverse number is: " + sum);
    }

    public static void findPalindrome() {
        int startNum, endNum, temp, remainder, sum;
        System.out.println("Enter the starting number: ");
        startNum = input.nextInt();
        System.out.println("Enter the ending number: ");
        endNum = input.nextInt();

        for (int i = startNum; i <= endNum; i++) {
            sum = 0;
            for (temp = i; temp != 0; temp = temp / 10) {
                remainder = temp % 10;
                sum = sum * 10 + remainder;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void ArmstrongNumber() {
        int sum, remainder, temp, start, end, count = 0;

        System.out.print("Starting number :");
        start = input.nextInt();
        System.out.print("Last number :");
        end = input.nextInt();


        for (int i = start; i <= end; i++) {
            sum = 0;
            for (temp = i; temp != 0; temp = temp / 10) {
                remainder = temp % 10;
                sum = remainder * remainder * remainder + sum;
            }
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total armstrong number is " + count);


    }

    public static void validateUser() {
        String userName, password;

        while (true) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("Naymur Rahman") && password.equals("kirehala")) {
                System.out.println("Welcome to the system.");
                break;
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }

}
