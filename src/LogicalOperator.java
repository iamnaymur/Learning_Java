import java.util.Scanner;

public class LogicalOperator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        loveJava();
        callCenter();
    }

    public static void loveJava() {
        System.out.println("Do you love java?");
        String answer = input.next();

        if (answer.equals("yes")) {
            System.out.println("The user loves java");
        } else if (answer.equals("no")) {
            System.out.println("The user does not love java");
        }
    }

    public static void callCenter() {
        String option;
        System.out.print("What language you would prefer :");
        input.nextLine();
        option = input.next();

        switch (option) {
            case "bengali":
                System.out.print("Selected Language is Bengali");
                break;
            case "english":
                System.out.print("Selected Language is English");
                break;
            case "urdu":
                System.out.print("Selected Language is Urdu");
                break;
            default:
                System.out.print("Selected Language is Unknown");
                break;
        }

    }
}
