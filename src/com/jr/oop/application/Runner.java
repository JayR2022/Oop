package com.jr.oop.application;

import com.jr.oop.inheritance.*;

public class Runner {
	public static void main(String[] args) {
		
//		uiBank newBankUi = new uiBank();
//		newBankUi.run();
		
//		Animal newAnimal = new Animal();
//		newAnimal.animalClass(newAnimal.classification="Bird");
//		newAnimal.fly(newAnimal.canFly=true);
//		
//		Animal newAnimal1 = new Animal();
//		newAnimal.animalClass(newAnimal.classification="Mammal");
//		newAnimal.fly(newAnimal.canFly=false);
////		
		
		Penguin newPenguin = new Penguin();
		newPenguin.eat(newPenguin.food);
		newPenguin.speak(newPenguin.sound);
		System.out.println(" ");
		
		Human newHuman = new Human();
		newHuman.eat(newHuman.food);
		newHuman.speak(newHuman.sound);
		System.out.println(" ");

		Dog newDog = new Dog();
		newDog.eat(newDog.food);
		newDog.speak(newDog.sound);
		System.out.println(" ");

		Shark newShark = new Shark();
		newShark.eat(newShark.food);
		newShark.speak(newShark.sound);
		System.out.println(" ");

		System.out.println("Total count of Animals registered: "+Animal.animalCount);

	}

}
