package org.list;

import java.util.LinkedList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		
		
	List l = new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);


	l.remove(10);
	System.out.println(l);

	}
}
