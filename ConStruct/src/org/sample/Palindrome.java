package org.sample;

public class Palindrome {
public static void main(String[] args) {
	int num=0,a,b;
	int n=141;
	b=n;
	while (n>0) {
		a=n%10;
		num=(num*10)+a;
		n=n/10;
		
	}
	if(b==num)
	{
		System.out.println("Palindrome Number");
	}
	else
	{
		System.out.println("Not a Palindrome Number");
	}
}
}