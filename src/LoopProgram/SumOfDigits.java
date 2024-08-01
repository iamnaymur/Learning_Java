package LoopProgram;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, remainder, temp, num;

        System.out.print("Enter the number: ");
        num = input.nextInt();

        for ( temp = num; temp != 0; temp = temp / 10) {
            remainder = temp % 10;
            sum = sum + remainder;
        }
        System.out.print("Sum of digits is: " + sum);

    }
}
