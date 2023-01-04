package org.sample;

public class Amstrong {
public static void main(String[] args) {
	int num=153,a,b, result=0;
	a=num;
	
while (a!=0) {
	b=a%10;
	result+=Math.pow(b, 3);
	a/=10;
}
if(result==num) {
System.out.println(num+" is an Amstrong Number");
}
else
{
	System.out.println(num+" is not an Amstrong Number");
}
}
}
