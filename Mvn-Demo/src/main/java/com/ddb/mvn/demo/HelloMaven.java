package com.ddb.mvn.demo;

import lombok.Getter;
import lombok.Setter;

public class HelloMaven {
	@Setter@Getter
	private String name;

	public HelloMaven(String name) {
		super();
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello Maven";

	}

	public static void main(String[] args) {
		HelloMaven hm = new HelloMaven("zhangsan");
		
		System.out.println("Hello Maven!" + hm.getName());
	}


}
