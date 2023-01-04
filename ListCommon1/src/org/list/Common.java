package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Common {
public static void main(String[] args) {
		List l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(60);
		l1.add(50);
		l1.add(40);
		l1.add(70);
		l1.add(80);
		l1.add(90);
			
		
		l1.retainAll(l);
		
		System.out.println(l1);
		
		

}
}
