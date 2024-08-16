package array;

public class FindOutput {
    public static void main(String[] args) {
//        findOutput1();
        findOutput2();
    }

    public static void findOutput1() {
        int[][] number = new int[4][5];
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                number[row][col] = k;
                k++;
            }
        }
        //printing
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(number[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void findOutput2() {
        int[][] num = new int[4][];
        num[0] = new int[1]; // this is how we can say the column number later ,even after declaring the 2d matrix and when the col bracket is empty.
        num[1] = new int[2]; //! new int[1]: Means "create an array with 1 element" (you can access this element at index 0). On the left num[1] is the index position and the `new int[1]` means the length or the size of how much element can fit on that specific index position.
        num[2] = new int[3];
        num[3] = new int[4];

        int k = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                num[row][col] = k;
                k++;
            }
        }

        //printing
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }
    }
}
