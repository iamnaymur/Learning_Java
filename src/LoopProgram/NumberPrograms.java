package LoopProgram;

import java.util.Scanner;

public class NumberPrograms {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        sumOfDigits();
        reverseNumber();
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

}
