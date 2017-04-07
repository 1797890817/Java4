package com.ddb.javacore.generic;

import java.util.ArrayList;

public class GenericList {

	public static void main(String[] args) {
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		display2(list1);
		
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		display2(list2);		//调用则报错！
		
		
	}

	//不是用泛型
	public static void display(ArrayList<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	//使用泛型
	public static void display2(ArrayList<?> list) {	//静态方法，不可以在此处使用T
		for (Object string : list) {
			System.out.println(string);
		}
	}
	
}
