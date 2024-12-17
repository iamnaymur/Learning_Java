package string;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        // stringBufferDemo1();
        // stringBuilderDemo();
        stringMethods();
        // palindrome();
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

        // if (reversed.equals(userString)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not a palindrome");
        // }
        if (checkPalindrome.toString().equals(userString)) {
            System.out.println("Palindrome");
        }

        input.close();
    }

    public static void stringBuilderDemo() {
        StringBuilder newLine = new StringBuilder();

        newLine.append("Tushar");
        newLine.append("Hello World");
        System.out.println(newLine);

        newLine.delete(2, 5);
        System.out.println(newLine);
    }

    public static void stringMethods() {
        String s = "Naymur Rahman Tushar";
        char m = s.charAt(10);

        boolean output = s.startsWith("Rah", 7);

        System.out.println(m);
        System.out.println(output);
    }
}
