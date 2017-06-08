package com.ddb.mvn.module1;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class HelloMaven1 {
	private String name;
	private int age;
	
	public HelloMaven1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void sayHello() {
		System.out.println("Hello Maven,I'm Module1");
	}

	public static void main(String[] args) {
		

	}

}
