package Pattern;

public class Array1 {
// Find the number of odd and even numbers in an array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd = 0;
		int x[]= {12, 13, 14, 15, 17};
		int even = 0;
		for(int i=0; i<=x.length-1; i++) {
			if(x[i]%2==0) {
				System.out.println(x[i]+" is an even number");
				 even = even +  1;
			}
			else {
				System.out.println(x[i]+" is an odd number");
				odd = odd +  1;
			}
		}
		System.out.println("Total number of even numbers in the array = " + even);
		System.out.println("Total number of odd numbers in the array = " + odd);
	}

}
