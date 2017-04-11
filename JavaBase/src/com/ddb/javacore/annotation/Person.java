package com.ddb.javacore.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends Human {
	@Default("12.5")
	private double score = 36.0;
	@HelloWorld("Beijing")
	private String address = "HeFei";

	@Deprecated
	public void showInfo() {
		System.out.println("Person [score=" + score + ",address=" + address + ", toString()=" + super.toString()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]");
	}

	@Override
	public String toString() {
		return "Person [score=" + score + ", toString()=" + super.toString() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
