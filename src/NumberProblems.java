
public class NumberProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + " (Multiple of both 3 and 5)" );
			}
			else if (i% 5 ==0) {
				System.out.println(i + " (Multiple of 5)" );
			}
			else if (i%3==0) {
				System.out.println(i + " (Multiple of 3)" );
			}
			else {
				System.out.println(i+ " ");
			}
				
			
			}
	}

}