package Pattern;
import java.util.Scanner;
public class Array2 {
// Search an element in an array
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter number");
	    int x = myObj.nextInt();  // Read user input
	    int b =0;
		// TODO Auto-generated method stub
		int a[]= {2, 26, 29, 17, 277};
		for(int i=0; i<=a.length-1; i++) {
			if (a[i]==x) {
				System.out.println("Element is present");
				b = 1;
				break;
			}
		}
		if(b==0) {
		System.out.println("Element is not present");
		}
	}

}
