package org.sample;

public class Fibona {
public static void main(String[] args) {
	int n=10;
	int first =0,second =1,result;
	System.out.println(first+" "+second);
	
	for (int i = 0; i<=n; ++i) {
		
	result=first+second;
	System.out.println(" "+result);
	first = second;
	second = result;
}
}
}