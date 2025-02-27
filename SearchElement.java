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
/*Algorithm for Searching an Element in an Array (Linear Search)

    Start
    Create a Scanner object to take user input.
    Prompt the user to enter the number of elements (n).
    Read the integer input (n) and initialize an integer array of size n.
    Prompt the user to enter n elements and store them in the array.
    Ask the user to enter the element (key) to search.
    Initialize a variable position = -1 (to track if the element is found).
    Loop through the array from index 0 to n-1:
        If arr[i] == key, set position = i and break the loop.
    Check the position variable:
        If position != -1, print the index where the element was found.
        Otherwise, print "Element not found".
    Close the Scanner object to avoid resource leaks.
    End*/
/*import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size and elements from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Search for the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Element not found.");
        sc.close();
    }
}
*/
