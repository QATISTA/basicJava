package Pattern;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Selenium";
String rev="";
int l = s.length();
for(int i=l-1; i>=0; i--) {
	rev = rev + s.charAt(i);
}
System.out.println(rev);



String s1[]= {"Rahul", "Shetty", "Pavan", "Selenium"};
System.out.println(Arrays.toString(s1));

String s2= "Rahul";
String rev2="";
char a[]=s2.toCharArray();
for(int j=a.length-1; j>=0; j--) {
	rev2 = rev2 + a[j];
	
}
System.out.println(rev2);

	}

	
	
	
}
