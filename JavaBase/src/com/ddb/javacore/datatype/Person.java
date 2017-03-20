package com.ddb.javacore.datatype;

public class Person {

	private String name = "Jack";
	private int age = 35;
	private boolean married = true;

	public Person() {
	}

	public Person(String str, int i, boolean flag) {
		name = str;
		age = i;
		married = flag;
	}

	public void display() {
		System.out.println(name + " " + age + " " + married);
	}

	public static void main(String[] args) {
		Person person = new Person("Rose", 20, false);
		person.display();
	}
}
