package com.ddb.javacore.ood4;

public final class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public Dog(String name, int age, int love) {
		super(name, age, love);
	}

	public void eat() {
		System.out.println("Dog eat!");
	}

	public void catchingFlyDisc() {
		System.out.println("和狗狗玩飞碟的方法！");
	}

}
