package wrapperClass;

public class NumberConversion {
    public static void main(String[] args) {
        String binary = "11000110";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "657";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println(decimal2);

        String hexaDecimal = "A";
        Integer decimal3 = Integer.parseInt(hexaDecimal, 16);
        System.out.println(decimal3);
    }

}
