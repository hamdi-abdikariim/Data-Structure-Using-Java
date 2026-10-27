 package Assignment.ExamRegistration;

import java.util.Scanner;

// Custom exception class
class InvalidRegistrationException extends Exception {
    public InvalidRegistrationException(String message) {
        super(message);
    }
}

public class ExamRegistration {

    // Checks student information
    public static void validateRegistration(String studentId, String name, int age, int mark, int subjects) throws InvalidRegistrationException {

        if (studentId == null || studentId.trim().isEmpty()) {
            throw new InvalidRegistrationException("Student ID cannot be empty.");
        }

        if (age < 18) {
            throw new InvalidRegistrationException("Age must be at least 18.");
        }

        if (mark < 0 || mark > 100) {
            throw new InvalidRegistrationException("Examination mark must be between 0 and 100.");
        }

        if (subjects < 1 || subjects > 5) {
            throw new InvalidRegistrationException("Maximum allowed subjects is 5.");
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Displays the system title
        System.out.println("===== EXAM REGISTRATION SYSTEM =====");
        System.out.println();

        try {
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Exam Mark: ");
            int mark = scanner.nextInt();

            System.out.print("Enter Number of Subjects: ");
            int subjects = scanner.nextInt();

            System.out.println();

            // Checks the entered information
            validateRegistration(studentId, name, age, mark, subjects);

            // Displays successful registration
            System.out.println("Registration Successful!");
            System.out.println("Student: " + name);
            System.out.println("Registered Subjects: " + subjects);

        } catch (InvalidRegistrationException e) {
            // Handles registration errors
            System.out.println("Registration Failed!");
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            // Handles invalid numbers
            System.out.println("Registration Failed!");
            System.out.println("Error: Please enter valid numbers for age, mark, and subjects.");

        } finally {
            // Runs at the end
            System.out.println();
            System.out.println("Registration attempt completed.");
            scanner.close();
        }
    }
}
