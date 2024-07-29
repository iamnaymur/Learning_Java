public class JavaLoops {
    public static void main(String[] args) {
        sumOfNumbers();
        factorial();
    }

    public static void sumOfNumbers() {
// ! Assignment -10
        int sum =0;
//        for (int i= 0; i<=10; i++){
//            sum = sum+i;
//        }

        int i = 0;
        do {
            sum = sum + i;
            i++;
        }
        while(i<=10);
        System.out.println("Total sum ="+sum);
    }
//!  Assignment -11
    public static void factorial() {
        int mul =1;
        for (int i =1; i<=3; i++) {
            mul = mul * i;
        }
        System.out.print(mul);
    }
}
