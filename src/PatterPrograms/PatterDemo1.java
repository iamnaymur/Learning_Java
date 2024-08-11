package PatterPrograms;

import java.util.Scanner;

public class PatterDemo1 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int num = input.nextInt();
//
//        for (int row = num; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(" " + col);
//            }
//            System.out.println();
//        }
        assignmentPatter();
    }


    public static void assignmentPatter() {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col % 2);
            }
            System.out.println();
        }
    }
}
