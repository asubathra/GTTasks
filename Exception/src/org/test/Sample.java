package org.test;

import java.util.InputMismatchException;

public class Sample {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		} catch (InputMismatchException e) {
			System.out.println("Anything is divided by 0 is infinity");
			
		}
		finally {
			System.out.println("Finally");
			}
		System.out.println(4);
		System.out.println(5);
	}
}
