import java.util.Scanner;


class InvalidUsernameException extends Exception {
    InvalidUsernameException(String s) {
        super(s);
    }
}


class InvalidPasswordException extends Exception {
    InvalidPasswordException(String s) {
        super(s);
    }
}

public class loginsystem {
    private static final String VALID_USERNAME = "saigayathri";
    private static final String VALID_PASSWORD = "pass@123";

   
    public static void authenticate(String user_name, String password)
            throws InvalidUsernameException, InvalidPasswordException {

        if (user_name.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }

        if (!user_name.equals(VALID_USERNAME)) {
            throw new InvalidUsernameException("No such user exists in the system.");
        }

        if (!password.equals(VALID_PASSWORD)) {
            throw new InvalidPasswordException("Wrong password.");
        }

        System.out.println("Welcome user: " + user_name);
    }

   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the username: ");
            String user_name = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            authenticate(user_name, password);
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            sc.close(); 
            System.out.println("end.");
        }
    }
}
