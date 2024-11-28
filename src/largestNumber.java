import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner sc= new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = sc.nextInt();

System.out.print("Enter the value of b: ");
int b = sc.nextInt();

System.out.print("Enter the value of c: ");
int c = sc.nextInt();

if(a>b && a>c) {
	System.out.println("Largest number is: "+ a);
	
}
else if (b>a && b>c) {
	System.out.println("Largest number is: "+ b);
}
else {
	System.out.println("Largest number is: "+ c);
}
	}

}
