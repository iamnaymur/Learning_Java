package series;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int num = input.nextInt();
        if (isPrime(num)){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
