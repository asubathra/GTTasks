package org.sample;

public class Count {
public static void main(String[] args) {
	int count=0,num=123;
	while (num!=0) {
		num/=10;
		count++;
	}
	System.out.println(count);
}
}
