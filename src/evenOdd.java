import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		
		if (a%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}
}
