package org.sample;

public class Check9 {
public static void main(String[] args) {
	String s ="Welcome to java class";
	boolean a = s.startsWith("Welcome");
	System.out.println(a);
	
	String s1= "Hai i am nisha";
	boolean b = s1.startsWith("welcome");
	System.out.println(b);

	boolean c = s.endsWith("class");
	System.out.println(c);

    boolean d = s.endsWith("java");
    System.out.println(d);
    
    boolean e = s.isEmpty();
    System.out.println(e);
    
    String s2 = " ";
    boolean f = s2.isEmpty();
    System.out.println(f);
}

}
