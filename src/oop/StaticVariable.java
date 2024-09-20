package oop;

public class StaticVariable {
    /*
    static member doesnt need creating a object of its class to use.
    ! Static member is not related to object, it is related to class
    */


    String studentName = "Naymur Rahman Tusher";
    static String amarName = "Naymurrrr Rahmannn";

    static int count = 0;

    StaticVariable() {
        count++;
    }

    void totalCount() {
        System.out.println(count);
    }
}
