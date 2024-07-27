import java.util.Scanner;

public class ControlStatement {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        System.out.print("Put your age :");
        age = input.nextInt();
        checkVoter(age);
    }

    public static void checkVoter(int age) {
        if (age >= 18) {
            System.out.print("This user is a Valid voter.");
        } else {
            System.out.print("This user is Not a valid voter.");
        }
    }
}
