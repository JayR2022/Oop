package com.jr.oop.inheritance;

public class Shark extends Animal implements AnimalCharacteristics{
	
	public String sound="no-vocals";
	public String food="fish";
	
	public Shark() {
		System.out.println(Shark.class);
		super.animalClass(super.classification="Chondrichthyes");
		super.fly(super.canFly=false);
	}
	
	public void speak(String sound) {
		System.out.println("i say "+sound);
		
	}
	
	public void eat(String food) {
		System.out.println("i eat "+food);
	}

}
