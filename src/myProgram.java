import java.util.Scanner;

public class myProgram {
    public static void main(String[] args) {
        // Object created for myCalculator class, which is not okay really
//        myCalculator calc = new myCalculator(10, 20);
//
//        System.out.println("Addition: " + calc.add());
//        System.out.println("Multiplication: " + calc.mul());
//        System.out.println("Division: " + calc.div());
        int first, second;
        Scanner input = new Scanner(System.in);
        first = input.nextInt();
        second = input.nextInt();
        calculate calc2 = new calculate(first, second);
        calc2.add();

    }
}

class calculate {
    int a, b;

    calculate(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println(a + b);
    }
}

