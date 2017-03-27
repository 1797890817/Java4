package com.ddb.javacore.ood4;

public class Penguin extends Pet {

	public Penguin() {
		super();
	}

	public Penguin(String name) {
		super(name);
	}

	public Penguin(String name, int age, int love) {
		super(name, age, love);
	}

	public void eat() {
		System.out.println("Penguin eat!");
	}

	public void swimming() {
		System.out.println("和企鹅玩游泳！！");
	}
}
