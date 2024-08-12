package array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        int sum = 0;
//
//        int[] arr; //  declaration
//        arr = new int[4]; //creation
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter 4 numbers :");
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("For position " + i + ": ");
//            arr[i] = input.nextInt();
//        }
//
//
////        for (int j = 0; j < arr.length; j++) {
////            sum = sum + arr[j];
////        }
//
//        //!For each loop example and works the same as the above one. For each loop is also called as "ENHANCED for loop" in java
//        for (int k : arr) {
//            sum = sum + k;
//        }
//
//        System.out.print("The sum is :" + sum);
//        System.out.print("\nThe average is :" + sum / arr.length);
//
//        //! Finding the maximum and minimum number from an array.
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.print("\nThe max is :" + max);

        //! For each loop in java
//        String[] names = {"Naymur", "Shafin", "Nahin", "Topu", "Jisan"};
//
//        System.out.print("The length :" + names.length);
//        for (String name : names) {
//            System.out.print(name + "\n");
//        }

        findDay();
    }

    public static void findDay() {
        Scanner input = new Scanner(System.in);

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.print("Enter the day 1-7:");
        int day = input.nextInt();

        for (int i = 0; i < days.length; i++) {
            if ((day - 1) == i) {
                System.out.print(days[i]);
            }
        }
    }
}
