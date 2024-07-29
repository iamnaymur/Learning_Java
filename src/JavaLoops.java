public class JavaLoops {
    public static void main(String[] args) {
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
}
