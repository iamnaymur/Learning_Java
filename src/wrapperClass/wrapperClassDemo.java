package wrapperClass;

public class wrapperClassDemo {
    public static void main(String[] args) {
        // Primitive -> Object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        // Object -> Primitive
        Double d = 10.25;
        double d2 = d.doubleValue();
        System.out.println(d2);
    }
}
