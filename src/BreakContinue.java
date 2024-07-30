public class BreakContinue {
    public static void main(String[] args) {
        for (int number= 0; number<= 10; number++) {
            if (number== 5) {
                break; //! It stops the loop completely and takes you out of the loop.
            } else if (number== 3) {
                continue; //! It skips the rest of the current loop iteration and move to the next iteration.
            }

            System.out.println(number);
        }
    }
}
