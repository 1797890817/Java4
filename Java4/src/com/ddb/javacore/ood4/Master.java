package com.ddb.javacore.ood4;

public class Master {
	/*
	 * public void feed(Dog dog) { dog.eat(); }
	 * 
	 * public void feed(Penguin pgn) { pgn.eat(); }
	 */

	public void feed(Pet pet) {
		pet.eat();
	}

	public Pet getPet(String typeId) {
		if (typeId.equalsIgnoreCase("dog")) {
			Pet pet = new Dog();
			return pet;
		} else if (typeId.equalsIgnoreCase("penguin")) {
			Pet pet = new Penguin();
			return pet;
		}
		return null;
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			// 向下转型
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin penguin = (Penguin) pet;
			penguin.swimming();
			//((Penguin) pet).swimming();
		}

	}

}