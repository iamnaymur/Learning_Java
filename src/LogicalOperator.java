import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        loveJava();
    }

    public static void loveJava() {
        System.out.println("Do you love java?");
        Scanner input = new Scanner(System.in);

        String answer;
        answer = input.next();


        if (answer.equals("yes")){
            System.out.println("The user loves java");
        } else if (answer.equals("no")) {
            System.out.println("The user does not love java");
        }
    }
}
