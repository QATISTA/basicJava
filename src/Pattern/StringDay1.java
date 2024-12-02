package Pattern;

public class StringDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String b = "Welcome to";
String a = " Java";
//String c = b+a;
String c = b.concat(a);
int x = a.length();
System.out.println(x);
System.out.println(c);
	
	
// trim()
	String a1 = "  Welcome  ";
	int b1 = a1.length();
	System.out.println(b1);
	String c1 = a1.trim();
	System.out.println(c1.length());
	
// charAt()
String a3 = "Welcome";
System.out.println(a3.charAt(4));
}
}