import java.util.Scanner;

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

public class UserValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            if (age < 18 || age > 55) {
                throw new InvalidUserException("User age should be between 18 and 55.");
            }

            System.out.print("Enter Monthly Income (in Rs.): ");
            double income = sc.nextDouble();
            sc.nextLine();
            if (income < 50000 || income > 100000) {
                throw new InvalidUserException("User income should be between Rs. 50,000 and Rs. 1,00,000 per month.");
            }

            System.out.print("Enter City: ");
            String city = sc.nextLine().trim();
            if (!(city.equalsIgnoreCase("Pune") ||
                  city.equalsIgnoreCase("Mumbai") ||
                  city.equalsIgnoreCase("Bangalore") ||
                  city.equalsIgnoreCase("Chennai"))) {
                throw new InvalidUserException("User must reside in Pune, Mumbai, Bangalore, or Chennai.");
            }

            System.out.print("Do you own a 4-wheeler? (yes/no): ");
            String vehicle = sc.nextLine().trim();
            if (!vehicle.equalsIgnoreCase("yes")) {
                throw new InvalidUserException("User must own a 4-wheeler.");
            }

            System.out.println("User validation successful.");

        } catch (InvalidUserException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            sc.close();
        }
    }
}
