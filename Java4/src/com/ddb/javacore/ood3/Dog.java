package com.ddb.javacore.ood3;

public final class Dog extends Pet {
	

	public Dog(String name, int age, int love) {
		super(name, age, love);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print2() {
		name = "宠物";
		age = 100;
		//System.out.println("print2 name: " + name + ",age:" + age + ", love:" + super.love);
	}
	
	/*@Override
	public void print() {
		System.out.println("print name: " + name + ",age:" + age + ", love:" + love);
	}*/
	
	

}
