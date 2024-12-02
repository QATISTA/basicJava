package Pattern;

public class ConstructorDemo {
	int x;
	int y;
	
	// Default Constructor
//	ConstructorDemo(){
//		 x = 100;
//		 y = 200;
//	}
	
	// Parameterized constructor
	ConstructorDemo(int a, int b){
		x = a;
		y = b;
	}
	void Sum(){
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorDemo c1 = new ConstructorDemo();
//		c1.Sum();
		
		ConstructorDemo c2 = new ConstructorDemo(11,12);
		c2.Sum();
	}

}
