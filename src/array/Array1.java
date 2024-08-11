package array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr; //  declaration
        arr = new int[4]; //creation
        Scanner input = new Scanner(System.in);
//  declaring and creating in a single line
//        int[] arr2 = new int[200];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("For position " + i + ": ");
            arr[i] = input.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }

        System.out.print("The sum is :" + sum);
        System.out.print("The average is :" + sum / arr.length);
    }
}
