public class MathClassDemo {
    public static void main(String[] args) {
        int x = 2, y=3, result;
        result = Math.max(x,y);

        double powerNums= Math.pow(x,y); //! pow func will always return the output value as double type.
        System.out.println(result);
        System.out.print(powerNums);
    }
}
