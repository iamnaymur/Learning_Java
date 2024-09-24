package oop;

public class TestOOP {
    public static void main(String[] args) {
        //* Encapsulation
        Encapsulation first = new Encapsulation();

        first.setterMethod(23, "tushar");
        System.out.println(first.getDetails());

        Inheritance second = new Inheritance();
        second.age = 2323;
        second.anotherName = "Naymur Rahman";
//        second.displayInfo();
    }
}

