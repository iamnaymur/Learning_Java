package string;

public class StringDemo {
    public static void main(String[] args) {
        stringDemo1();
    }

    public static void stringDemo1() {
//        A character of array is called string.
        String s1 = "Naymur Rahman";
        String s2 = new String("Naymur Rahman"); //This also works fine.
/*
        System.out.println(s1);
        System.out.println(s2);*/

        if (s1.equals(s2)) {
            System.out.println("Equals.");
        }
        if (s1.contains("Naymur")) {
            System.out.println("yes");
        }
        if (s1.equalsIgnoreCase(s2)) { // This method is to ignore case sensitiveness.
            System.out.println("Equals. ");
        }

        boolean contains = s1.contains("Naymur");
        System.out.println(contains);

        boolean b = s1.isEmpty();
        System.out.println(b);
    }
}
