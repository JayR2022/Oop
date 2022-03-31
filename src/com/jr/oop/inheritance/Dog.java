package com.jr.oop.inheritance;

public class Dog extends Animal implements AnimalCharacteristics{
	
	public String sound="bark";
	public String food="bones";
	
	public Dog() {
		System.out.println(Dog.class);
		super.animalClass(super.classification="Mammal");
		super.fly(super.canFly=false);
	}
	
	public void speak(String sound) {
		System.out.println("i say "+sound);
		
	}
	
	public void eat(String food) {
		System.out.println("i eat "+food);
	}

}
