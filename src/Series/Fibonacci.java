package Series;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

//        int fibo, first = 0, second = 1, num;
//        System.out.print("How many numbers you want to print for fibo :");
//        num = new Scanner(System.in).nextInt();
//
////        System.out.print(first + " " + second);
//
//        for (int i = 0; i < num; i++) {
//            if (i <= 1) {
//                fibo = i;
//            } else {
//                fibo = first + second;
//                first = second;
//                second = fibo;
//            }
//            System.out.print(fibo + ", ");
//
//        }

        findNumFibonacci();
    }

    public static void findNumFibonacci() {
        int fibo=0, first = 0, second = 1, num;
        System.out.print("Which Fibonacci number you want to see: ");
        num = new Scanner(System.in).nextInt();

//        System.out.print(first + " " + second);

        for (int i = 0; i < num; i++) {
            if (i <= 1) {
                fibo = i;
            } else {
                fibo = first + second;
                first = second;
                second = fibo;
            }


        }
        System.out.print("For the position "+num+":"+fibo + ", ");
    }
}
