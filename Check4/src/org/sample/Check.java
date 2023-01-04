package org.sample;

public class Check {
public static void main(String[] args) {
	
	
	String s = "NISHANTHI";
	String a = s.toLowerCase();
	System.out.println(a);
	
	String s1 = "nishanthi";
	String b = s1.toUpperCase();
	System.out.println(b);
	
	String s2 = "WelcomE";
	for (int i = 0; i < s2.length(); i++) {
		char ans  =(char) (s2.charAt(i) ^32);
		System.out.print(ans);

	}
	
	String s3= "Welcome to java";
	
	int count=0;
	
	for (int j = 0; j < s3.length(); j++) {
	if (Character.isUpperCase(s3.charAt(j)));
	{
	count++;
	}	


 System.out.println("Number of Uppercase:" + count);
	

}
}
}