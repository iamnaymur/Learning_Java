package array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        ascendingSort();
        descendingSort();
    }

    public static void ascendingSort() {
        int[] number = {123, 323, 45, -32, 9};

        Arrays.sort(number);
        System.out.print("Ascending Sort: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void descendingSort() {
        int[] number = {123, 323, 45, -32, 9};

        Arrays.sort(number);
        System.out.print("Descending Sort: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}
