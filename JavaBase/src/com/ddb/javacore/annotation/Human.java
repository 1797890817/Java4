package com.ddb.javacore.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Human {
	private String name;
	private int age;

	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}
