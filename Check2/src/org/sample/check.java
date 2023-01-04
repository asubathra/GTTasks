package org.sample;

public class check {
public static void main(String[] args) {
	String s = "Welcome to Java class";
	String a = s.replace("Java","Sql");
	System.out.println(a);
	
	String s1 = "Greens Adayar";
	String b = s1.replace("Adayar","Omr");
	System.out.println(b);
	
	String c = s.replace(' ','#');
	System.out.println(c);
	
   String s2="Nishakerala24@gmail.com";
   String d= s2.replace("gmail","yahoo");
   System.out.println(d);
 
   String s3="5-35-2a venkatesh nivas,Aruppukkottai,pincode-626101";
   String e=s3.replace(",pincode-626101"," ");
   System.out.println(e);
}

}
