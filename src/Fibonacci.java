
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i;  
		 System.out.print(n1+" "+n2);//printing 0 and 1  
		 
		 for (i=1; i<=10; i++)
		 {
			 n3=n1+n2;
			 System.out.print(" "+n3); 
			 n1= n2;
			 n2= n3;
			 
					
		 }
	}

}
