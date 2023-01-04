package org.list;

import java.util.LinkedList;
import java.util.List;

public class Index {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		
		boolean s =l.contains(10);
	
		System.out.println(s);
}
	}