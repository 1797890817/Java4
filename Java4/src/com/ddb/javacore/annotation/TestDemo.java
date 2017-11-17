package com.ddb.javacore.annotation;

public class TestDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Lisi");
		person.setAge(26);
		person.setScore(60);

		person.showInfo();

	}

}
