package com.ddb.javacore.generic;

import java.util.ArrayList;

public class TestBound {

	public static void main(String[] args) {
		ArrayList<A> listA = new ArrayList<A>();
		listA.add(new A("AA"));
		listA.add(new A("A"));
		listA.add(new A("AAA"));
		print(listA);

		ArrayList<B> listB = new ArrayList<B>();
		listB.add(new B(23));
		listB.add(new B(24));
		listB.add(new B(25));
		print(listB);
		
		print2(listA);
		print2(listB);

	}

	public static void print(ArrayList<? super B> info) {
		for (Object object : info) {
			System.out.println(object);
		}
	}
	
	public static void print2(ArrayList<? extends A> info) {
		for (Object object : info) {
			System.out.println(object);
		}
	}

}
