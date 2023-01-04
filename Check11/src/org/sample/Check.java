package org.sample;

public class Check {
public static void main(String[] args) {
	String s1= "Nisha";
	String s2= "Nisha";
	System.out.println("LiteralString");
	System.out.println(s1+" "+System.identityHashCode(s1));
   System.out.println(s2+" "+System.identityHashCode(s2));
   

 String s3=new String("Nisha");
 String s4=new String("Nisha");
 System.out.println("Non Literal String");
 System.out.println(s3+" "+System.identityHashCode(s3));
 System.out.println(s4+" "+System.identityHashCode(s4));
 
 
 
 String s5= new String("Nisha");
 String s6=new String("Rengam");
 String s7=new String("NishaRengam");
 System.out.println(s5+" "+System.identityHashCode(s5));
 System.out.println(s6+" "+System.identityHashCode(s6));
 System.out.println(s7+" "+System.identityHashCode(s7));

String s8="Nisha";
String s9="Rengam";
String s10="NishaRengam";
System.out.println(s8+" "+System.identityHashCode(s8));
System.out.println(s9+" "+System.identityHashCode(s9));
System.out.println(s10+" "+System.identityHashCode(s10));
}


}
