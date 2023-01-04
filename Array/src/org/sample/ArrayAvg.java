package org.sample;

public class ArrayAvg {
public static void main(String[] args) {
	
	int  a[]= {1,2,3,4,5,6,7,8,9,10};
	
	double avg,sum;
	sum=0;
	for(int i=0;i<a.length;i++)
	{
	sum+=a[i] ;}
	System.out.println("Sum of the array element is:" + sum);
	avg=sum/a.length;
System.out.println(avg);
}


}
