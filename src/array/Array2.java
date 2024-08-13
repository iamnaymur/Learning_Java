package array;

public class Array2 {
    public static void main(String[] args) {
        int[][] number = new int[2][3];
        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[1][0] = 4;
        number[1][1] = 5;
        number[1][2] = 6;


        for (int row = 0; row < number.length; row++) {
            System.out.print("The row length" + number[row].length);
            for (int col = 0; col < 3; col++) {
                System.out.print(number[row][col] + " ");
            }
            System.out.println();
        }
    }
}

