package org.list;

import java.util.LinkedList;
import java.util.List;

public class Get {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(l.get(i));
			

		}
		}
}


