package com.neotech.review04;

public class Methods {
	public static void main(String[] args) {

		Methods n = new Methods();

		n.sayWelcome();
		n.sayWelcomeTimes(4);
		
		n.sayGreeting("Hola!");
		n.sayGreetingTimes("Ciao", 3);
	}

	void sayWelcome() {
		for(int i=0; i<5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayWelcomeTimes(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for(int i=0; i<5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	void sayGreetingTimes(String greeting, int n) {
		for (int i=0; i<n; i++) {
			System.out.print(greeting + " ");
		}
	}

}
