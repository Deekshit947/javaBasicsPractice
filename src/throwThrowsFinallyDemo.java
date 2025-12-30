public class throwThrowsFinallyDemo {

        static void checkAge(int age) throws Exception {
            if (age < 18) {
                throw new Exception("Not eligible: age must be 18+");
            }
            System.out.println("Eligible.");
        }

        public static void main(String[] args) {
            try {
                checkAge(16);
                System.out.println("This line will not run if exception is thrown.");
            } catch (Exception e) {
                System.out.println("Caught exception: " + e.getMessage());
            } finally {
                System.out.println("Finally block always executes (cleanup code goes here).");
            }

            System.out.println("Program continues after try-catch-finally.");
        }

}
