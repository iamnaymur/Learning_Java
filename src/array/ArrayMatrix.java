package array;

import java.util.Scanner;

public class ArrayMatrix {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        matrixPart1();
    }

    public static void matrixPart1() {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.print("Enter elements for A matrix :");
        //Getting input for matrix A
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                System.out.print("A[" + row + "][" + col + "] = ");
                A[row][col] = input.nextInt();
            }
        }
        //Getting input for matrix B
        for (int row = 0; row < B.length; row++) {
            for (int col = 0; col < B[row].length; col++) {
                System.out.print("B[" + row + "][" + col + "] = ");
                B[row][col] = input.nextInt();
            }
        }


        //printing matrix A
        System.out.println("Matrix A:");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for (int row = 0; row < B.length; row++) {
            for (int col = 0; col < B[row].length; col++) {
                System.out.print(" " + B[row][col]);
            }
            System.out.println();
        }
    }
}
