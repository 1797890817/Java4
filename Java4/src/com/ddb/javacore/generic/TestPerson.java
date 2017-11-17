package com.ddb.javacore.generic;

public class TestPerson {

	public static void main(String[] args) {
		// 使用时指定T为Integer类型
		Person<Integer> person1 = new Person<Integer>();
		person1.setName("zhangsan");
		person1.setPass(123456);
		String info1 = person1.getName() + " : " + person1.getPass();
		System.out.println(info1);

		// 使用时指定T为String类型
		Person<String> person2 = new Person<String>();
		person2.setName("lisi");
		person2.setPass("654321");
		String info2 = person2.getName() + " : " + person2.getPass();
		System.out.println(info2);

	}

}
