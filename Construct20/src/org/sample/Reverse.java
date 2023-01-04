package org.sample;

public class Reverse {
public static void main(String[] args) {
	int num=123,i=0;
	
	while (num!=0) {
		int s =num%10;
		i=i*10+s;
		num=num/10;
		}
	System.out.println(i);
}
}
