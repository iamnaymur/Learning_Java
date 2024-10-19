import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopPrograms {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        PrintNumbers();
        SquareSeries();
    }


    //    Print sum of all the even numbers from m to n.
    public static void PrintNumbers() {
        int start, last, sum = 0;

        System.out.print("Enter the starting number :");
        start = input.nextInt();
        System.out.print("Enter the end number :");
        last = input.nextInt(); 


        for (int i = start; i <= last; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("total =" + sum);
    }

    public static void SquareSeries() {
        int n, sum =0;
        System.out.print("Enter the last number :");
        n = input.nextInt();

        for (int i =1; i<=n; i++ ){
            System.out.println(i+"x"+i);
            sum = sum + i*i;
        }
        System.out.print("Total sum of the series :"+sum);
    }
}

