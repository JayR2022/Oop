package com.jr.oop.inheritance;

public class Animal {
	public String classification;
	public boolean canFly;
	public static int animalCount=0;
	
	public Animal() {
		animalCount++;
	}
	
	public void animalClass(String classification) {
		System.out.println("i am a "+ classification);
	}
	
	public void fly(boolean canFly) {
		if (canFly == true){
			System.out.println("i can fly");
		}
		else {
			System.out.println("i cannot fly");
		}
	}
		
	
}
