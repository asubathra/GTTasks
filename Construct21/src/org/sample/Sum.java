package org.sample;

public class Sum {
public static void main(String[] args) {
	int num=123,a,b=0;
	while (num>0) {
	a=num%10;
	b=b+a;
	num=num/10;
	}
System.out.println(b);
}

}
