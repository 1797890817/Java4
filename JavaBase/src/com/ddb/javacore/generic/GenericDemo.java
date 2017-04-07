package com.ddb.javacore.generic;

import java.util.HashMap;

public class GenericDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//不使用泛型：
		HashMap persons = new HashMap();
		persons.put(1, "PID001");
		persons.put(2, "PID002");
		persons.put(3, "PID003");
		persons.put(4, "PID004");
		
		String name3 = (String) persons.get(3);	//需要强制转型！
		System.out.println("The No.3 is :"+name3);
		
		//使用泛型：
		HashMap<Integer,String> persons2 = new HashMap<Integer,String>();
		
		persons2.put(1, "PID001");
		persons2.put(2, "PID002");
		persons2.put(3, "PID003");
		persons2.put(4, "PID004");
		
		String name4 = persons2.get(4);	//不需要强制转型！
		System.out.println("The No.4 is :"+name4);
		
	}

}
