package Pattern;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring array
		// approach 1
		
		int a[][]= new int[3][3];
		a[0][0] = 11;
		a[0][1] = 22;
		a[0][2]= 33;
		
		a[1][0] = 44;
		a[1][1] = 55;
		a[1][2] = 66;
		
		a[2][0] = 77;
		a[2][1] = 88;
		a[2][2] = 99;
		
		//System.out.println(a[1][1]);
		// approach 2
		int x[][] = {	{100, 200},
						{300, 400},
						{500, 600}
					
	};
		int row = x.length;
		int col = x[0].length;
		
		System.out.println("Length of row of the array x "+ row);
		System.out.println("Length of column of the array x " + col);
		// read single value from 2D array
		System.out.println(x[1][1]);
		
		// read all value from 2D array
		for (int i=0; i<=row-1; i++) {
			for(int j=0;j<=col-1; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
}
}
