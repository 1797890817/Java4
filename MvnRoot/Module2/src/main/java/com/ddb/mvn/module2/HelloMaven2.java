package com.ddb.mvn.module2;

import com.ddb.mvn.module1.HelloMaven1;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class HelloMaven2 {
	private String name;
	private int age;
	
	public HelloMaven2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public static void sayHello() {
		System.out.println("Hello Maven,I'm Module2");
	}


	public static void main(String[] args) {
		HelloMaven1.sayHello();
		HelloMaven2.sayHello();
		HelloMaven1 hm1 =new HelloMaven1("m1",20);
		HelloMaven2 hm2 =new HelloMaven2("m2",25);
		System.out.println(hm1.getName()+"---"+hm1.getAge());
		System.out.println(hm2.getName()+"---"+hm2.getAge());
		
	}

}
