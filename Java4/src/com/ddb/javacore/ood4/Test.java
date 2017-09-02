package com.ddb.javacore.ood4;

public class Test {

	public static void main(String[] args) {
		Master master = new Master();
		Dog dog = new Dog();
		Penguin penguin = new Penguin();

		/*
		 * master.feed(dog); master.feed(penguin);
		 */
		// master.feed(xxx);

		Pet pet = new Dog();
		master.feed(pet);

		Pet pet2 = new Penguin();
		master.feed(pet2);

		// 领养一个宠物的方法
		Pet pet3 = master.getPet("Dog");
		pet3.eat();
		Pet pet4 = master.getPet("Penguin");
		pet4.eat();
		
		//陪宠物玩耍
		master.play(pet3);
		master.play(pet4);

	}

}
