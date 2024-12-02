package Pattern;

import java.util.Arrays;

public class Basic_java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcaacc";
		String s1 = s.replace('a', 'x').replace('c', 'y');
		System.out.println(s1);
		
		String s2 = "abc@gmail.com";
		String b[]= s2.split("@");
		System.out.println(Arrays.toString(b));
		
		
		String s3 = "$15,20,25";
		String s4 = s3.replace("$", "").replace(",", "");
		System.out.println(s4);
		
		String s5 = "abc,123@xyz";
		String s6 = s5.replace(",","").replace("@","");
		System.out.println(s6);
		
		String a1 = s6.substring(0,3) ;
		String a2 = s6.substring(3,6) ;
		String a3 = s6.substring(6,9) ;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
	
	
}
