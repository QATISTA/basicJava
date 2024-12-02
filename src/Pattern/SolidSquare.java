package Pattern;

import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
    	System.out.println("Enter number of * in each row: ");
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt();
        int size = n; // Change this value to adjust the size of the square
        
        // Loop through each row
        for (int i=0; i<size; i++) {
            // Loop to print each column in the row
            for (int j = 0; j < size; j++) {
                System.out.print("* "); // Print asterisk followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}