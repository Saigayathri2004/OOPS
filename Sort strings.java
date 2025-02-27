import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Initialize an array of Strings with size n
        String[] arr = new String[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Close the Scanner
        sc.close();
    }
}
