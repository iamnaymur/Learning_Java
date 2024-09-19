package oop;

public class Test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Naymur", "Male", 42345534);
        Teacher teacher2 = new Teacher();
        //teacher1.setInformation("Naymur", "Male", 42345534); // usual way of passing data without constructor.

        //using a constructor

        teacher2.showInformation();
        teacher1.showInformation();

        System.out.println("From line 15 -"+teacher1.multiplyValue(5));
    }
}
