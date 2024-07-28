import java.util.Scanner;

public class ControlStatement {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        System.out.print("Put your age :");
        age = input.nextInt();
        checkVoter(age);
        checkLetter();
    }

//    Check voter function
    public static void checkVoter(int age) {
        if (age >= 18) {
            System.out.print("This user is a Valid voter.");
        } else {
            System.out.print("This user is Not a valid voter.");
        }
    }

//    Check letter function
    public static void checkLetter() {
        System.out.print("Please enter your letter : ");
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.print("This is a capital letter.");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.print("This is not a capital letter.");
        }
        else {
            System.out.print("This is not a letter.");
        }
    }
}
