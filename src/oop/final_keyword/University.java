package oop.final_keyword;

public class University {
    final String name = "SUB"; //This cant be change after because I used final keyword

    final String dep_name; // Black final variable, and to initialize this we need a constructor.

    static final String department;

    static {
        department = "Pharmarcy"; //Have to use this static block to initialize the static blank final variable.
    }

    University() {
        dep_name = "CSE";
    }

    int fees = 600000;

    void display() {
        System.out.println(name);
        System.out.println(fees);
    }

}
