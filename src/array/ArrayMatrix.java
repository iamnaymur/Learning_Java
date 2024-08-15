package array;

import java.util.Scanner;

public class ArrayMatrix {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        matrixPart1();
        diagonalMatrix();
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

        //Adding two matrix
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                System.out.print(" " + A[row][col] + B[row][col]);
            }
            System.out.println();
        }
    }

    public static void diagonalMatrix() {
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0, sumOfUpperElements = 0, sumOfLowerElements = 0;

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                A[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];

                }
                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
            }
        }

        System.out.print("Diagonal sum of elements :" + sumOfDiagonalElements);
        System.out.print("Lower elements sum :" + sumOfLowerElements);
        System.out.print("Upper elements sum :" + sumOfUpperElements);

    }
}
