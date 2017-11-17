package com.ddb.javacore.reflect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	private String name = "zhangsan";
	private int age = 35;

	// 构造方法
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	// 构造方法结束

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	public void printPersonSelf() {
		System.out.println("我是Person中的-printPersonSelf："+this.toString());
	}

}
