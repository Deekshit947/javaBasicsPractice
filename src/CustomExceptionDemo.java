class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. Given: " + marks);
        }
        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(120); 
        } catch (InvalidMarksException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}

