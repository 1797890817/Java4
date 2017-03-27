package com.ddb.javacore.ood4;

public abstract class Pet {
	String name;
	int age=50;
	private int love =100;
	
	public Pet() {
		super();
	}

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
	
	public void eat() {
		System.out.println("Pet eat mrthod!");
	}

}
