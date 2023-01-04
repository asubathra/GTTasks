package org.sample;

public class Check {
public static void main(String[] args) {
	String s = "Nisha";
	String s1 = "nisha";
	int a = s.compareTo(s1);
	System.out.println(a);
	
	String s2  = "Nia";
	String s3 = "nisha";
	int b = s2.compareTo(s3);
	System.out.println(b);
}
}