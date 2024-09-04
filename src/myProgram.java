public class myProgram {
    public static void main(String[] args) {
        // Object created for myCalculator class, which is not okay really
        myCalculator calc = new myCalculator(10, 20);

        System.out.println("Addition: " + calc.add());
        System.out.println("Multiplication: " + calc.mul());
        System.out.println("Division: " + calc.div());
    }
}
