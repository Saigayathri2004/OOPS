import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prompt the user to enter the element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform linear search
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i; // Store the index if found
                break;
            }
        }

        // Display the result
        if (position == -1) {
            System.out.println("Element " + key + " not found in the array.");
        } else {
            System.out.println("Element " + key + " found at index: " + position);
        }

        // Close the Scanner
        sc.close();
    }
}
