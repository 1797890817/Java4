package com.ddb.javacore.ood3;

public abstract class Pet {
	String name;
	int age=50;
	private int love =100;

	public Pet(String name, int age, int love) {
		super();
		this.name = name;
		this.age = age;
		this.love = love;
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public final void print() {
		System.out.println("name: " + name + ",age:" + age + ", love:" + love);
	}
	
	public abstract void print2();

}
