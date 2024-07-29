public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; //! It stops the loop completely and takes you out of the loop.
            } else if (i == 3) {
                continue; //! It skips the rest of the current loop iteration and move to the next iteration.
            }

            System.out.println(i);
        }
    }
}
