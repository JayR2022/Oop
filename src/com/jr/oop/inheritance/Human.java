package com.jr.oop.inheritance;

public class Human extends Animal implements AnimalCharacteristics {
	
	public String sound="hello";
	public String food="mars bars";
	
	public Human() {
		System.out.println(Human.class);
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
