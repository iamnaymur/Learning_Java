

public class myCalculator {

    public double a, b;

    // Constructor name should match the class name
    public myCalculator(double first, double second) {
        a = first;
        b = second;
    }

    public double add() {
        return a + b;
    }

    public double mul() {
        return a * b;
    }

    public double div() {
        return a / b;
    }
}