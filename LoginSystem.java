import java.util.Scanner;

// Custom Exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom Exception for invalid password
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {

    // Hardcoded valid credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public static void authenticate(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        if (!username.equals(VALID_USERNAME)) {
            throw new InvalidUsernameException("Error: Username is incorrect.");
        }

        if (!password.equals(VALID_PASSWORD)) {
            throw new InvalidPasswordException("Error: Password is incorrect.");
        }

        System.out.println("Login successful! Welcome " + username);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            authenticate(username, password);

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Authentication process ended.");
        }
    }
}
