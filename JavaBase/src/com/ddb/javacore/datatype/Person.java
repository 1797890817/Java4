package com.ddb.javacore.datatype;

public class Person {

	private String name = "Jack";
	private int age = 35;
	private boolean married = true;

	// 无参构造函数
	public Person() {
	}

	// 有参构造函数
	public Person(String str, int i, boolean flag) {
		name = str;
		age = i;
		married = flag;
	}

	public void display() {
		int height = 178;
		int weight = 150;
		
		System.out.println(name + " " + age + " " + married + " " + height + " " + weight);
	}

	public boolean display2(int height,int weight) {

		System.out.println(name + " " + age + " " + married + " " + height + " " + weight);
		return true;
	}
	public static void main(String[] args) {

		// 不使用引用类型的方式
		System.out.println("不使用引用类型的方式 :");
		String name = "Jack";
		int age = 35;
		boolean married = true;
		System.out.println(name + " " + age + " " + married);

		//使用引用的方式
		System.out.println("使用引用类型的方式 :");
		Person person = new Person("Rose", 20, false);
		//Person person = new Person();
		person.display();
		boolean result= true;
		//boolean result= person.display2(156, 150);
		
		System.out.println("result : " + result);

	}
}
