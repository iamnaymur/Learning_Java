package oop.this_keyword;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Tushar", 22);
        person1.displayInfo();

        Person person2 = new Person("Tushar", "male", true, 22);
        person2.displayInfo();
    }
}
