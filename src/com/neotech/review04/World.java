package com.neotech.review04;

public class World {
	public static void main(String[] args) {
		
		//Declaring and initializing
		Baby baby = new Baby();
		
		baby.name = "Hazel";
		baby.weight = 7;
		
		System.out.println("The name of baby1 is --> " + baby.name);
	
		baby.hairColor = "brown";
		baby.gender = 'f';
		
		System.out.println(baby.hairColor + " "+ baby.gender);
	    
	     Baby baby2 = new Baby();
	     
	     baby2.name = "John";
	     System.out.println(baby2.name);
	     
	     baby.cry();
	     baby2.eat();
	}

}
