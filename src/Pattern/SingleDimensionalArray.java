package Pattern;
/*
 1) Declare an array
 2) Add values into array
 3) FInd size of array
 4) Read single value from an array
 5) Read multiple value from an array
 */


public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,7,9};
		int b = a.length;
		// find length of an array
		System.out.println("Length of array: " + b);
		
		// read single value from an array
		System.out.println("Reading single value from array: "+ a[2]);
		
		// read all values from an array
		// approach 1
		
//		System.out.println("Reading entire array: ");
//		for(int i=0; i< b; i++) {
//			
//			System.out.println(a[i]);
//		}
		
		// approach 2
		for (int x:a) {
		System.out.println(x);
	}
	}
}
