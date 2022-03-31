package com.jr.oop.inheritance;

public class Penguin extends Animal implements AnimalCharacteristics{
	
	public String sound="bleat";
	public String food="fish";
	
	public Penguin() {
		System.out.println(Penguin.class);
		super.animalClass(super.classification="bird");
		super.fly(super.canFly=true);
		
	}
	
	
	public void speak(String sound) {
		System.out.println("i say "+sound);
		
	}
	
	public void eat(String food) {
		System.out.println("i eat "+food);
	}

}
