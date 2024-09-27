package oop.this_keyword;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Tushar", 22);
        //person1.displayInfo();

        Person person2 = new Person("Tushar", "male", true, 22);
        // person2.displayInfo();

        Student student1 = new Student("Tushar", 22);
//        student1.displayInfo();

        Car car1 = new Car("red", 22);
//        car1.printDetails();


        Rectangle Box1 = new Rectangle();
        Box1.printDetails();
    }
}
