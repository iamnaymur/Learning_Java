package array;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
//        arrayListDemo();
//        arrayListMethods();
        arrayListMethods2();
    }

    public static void arrayListDemo() {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1, 4);
        //System.out.println(number.size());
        System.out.println(number);
        number.remove(2);
        System.out.println("After removing :" + number);
        //* Using for each
//        for (Integer x : number) {
//            System.out.print(x + " ");
//        }
        //* Using iterator
//        Iterator x = number.iterator();
//        while (x.hasNext()) {
//            System.out.print(x.next() + ", ");
//        }
    }

    public static void arrayListMethods() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1, 4);

//        num.clear();
        boolean check = num.isEmpty();

        num.set(2, 4); //replace an element that already exist.

        int value = num.get(0);
        System.out.println(value);


    }

    public static void arrayListMethods2() {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();

        num1.add(1);
        num1.add(2);
        num1.add(3);
        num2.add(1);
        num2.add(2);
        num2.add(3);
        System.out.println(num2);

        num3.addAll(num1);
        /*
        ! This is the alternative way of addAll
        ArrayList<Integer> num3 = new ArrayList<>(num1);
        */
        System.out.println(num3);

        boolean equals = num1.equals(num2);
        System.out.println(equals);

    }
}
