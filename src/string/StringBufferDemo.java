package string;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
//        stringBufferDemo1();
        stringBuilderDemo();
//        palindrome();
    }

    public static void stringBufferDemo1() {
        StringBuffer sb = new StringBuffer("Kire");
        sb.append("Hello World");

        System.out.println(sb);
    }

    public static void palindrome() {
        Scanner input = new Scanner(System.in);
        String userString;
        userString = input.nextLine();

        StringBuffer checkPalindrome = new StringBuffer(userString);

        checkPalindrome.reverse();

//        if (reversed.equals(userString)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
        if (checkPalindrome.toString().equals(userString)) {
            System.out.println("Palindrome");
        }
    }

    public static void stringBuilderDemo() {
        StringBuilder newLine = new StringBuilder();

        newLine.append("Tushar");
        newLine.append("Hello World");
        System.out.println(newLine);

        newLine.delete(2, 5);
        System.out.println(newLine);
    }
}
