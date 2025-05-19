import java.io.*;

class file2 {
    public static void main(String args[]) throws IOException {
        FileInputStream f = new FileInputStream("number.txt");
        FileOutputStream f2 = new FileOutputStream("odd.txt");
        FileOutputStream f3 = new FileOutputStream("even.txt"); 

        int c;
        while ((c = f.read()) != -1) {
            if (Character.isDigit(c)) {
                int digit = c - '0'; // Convert ASCII to integer
                if (digit % 2 == 0) {
                    f3.write(c); // Even number
                } else {
                    f2.write(c); // Odd number
                }
            }
            System.out.print((char) c); // Print the original character
        }

        f.close();
        f2.close();
        f3.close();

        System.out.println("\n\nContents of odd.txt:");
        try (FileInputStream oddFile = new FileInputStream("odd.txt")) {
            while ((c = oddFile.read()) != -1) {
                System.out.print((char) c);
            }
        }

        System.out.println("\nContents of even.txt:");
        try (FileInputStream evenFile = new FileInputStream("even.txt")) {
            while ((c = evenFile.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}

