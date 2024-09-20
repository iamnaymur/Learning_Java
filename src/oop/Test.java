package oop;

public class Test {
    public static void main(String[] args) {

//        Teacher teacher1 = new Teacher("Naymur", "Male", 42345534);
//        Teacher teacher2 = new Teacher();
//        //teacher1.setInformation("Naymur", "Male", 42345534); // usual way of passing data without constructor.
//
//        //using a constructor
//
//        teacher2.showInformation();
//        teacher1.showInformation();
//
//        System.out.println("From line 15 -"+teacher1.multiplyValue(5));

//        StaticKeyword s1 = new StaticKeyword("Naymur", 234);
//        StaticKeyword s2 = new StaticKeyword("Tushar", 635);
//        s1.displayInfo();
//        s2.displayInfo();

//        StaticVariable student = new StaticVariable();
//        System.out.println(student.studentName);


        //! To use static variable creating a object is not required. Static member is related to class, not object.
//        System.out.println(StaticVariable.amarName);

//        StaticVariable s1 = new StaticVariable();
//        s1.totalCount();
//        StaticVariable s2 = new StaticVariable();
//        s2.totalCount();
//        StaticVariable s3 = new StaticVariable();
//        s3.totalCount();


        StaticMethod.displayTwo(); //! Here I can access the method without creating an object cause I used the static method.

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.displayOne(); //! This is because I didnt use static with the displayOne.
    }
}
