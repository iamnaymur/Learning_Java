package oop.this_keyword;

public class Person {
    //Instance variable
    String name, gender;
    boolean isMarried;
    int age;

    Person(String name, String gender, boolean isMarried, int age) {
        this(name, age); //* calling the constructor will the name and age parameters using these keywords, so that I don't have to put those parameters again here.
        this.isMarried = isMarried;
        this.gender = gender;
    }

    Person(String name, int age) {
        this.name = name; //local variable
        this.age = age;
        this.isMarried = false;
        this.gender = "Not specified"; //* Default values, as we will not pass gender and isMarried for this constructor.
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Married: " + isMarried);
        System.out.println("Gender: " + gender);
    }

}
