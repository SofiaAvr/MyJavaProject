package com.neotech.review02;

public class WhileDemo {
	public static void main(String[] args) {
		
		String greeting = "Miremegjes";
		int num = 1;
		
		while (num<=5) {
		System.out.println( greeting + " " + num++);
		}
		
		int count = 5;
		
		while(count >0) {
			System.out.println("Count is "+ count);
			count --;
			
		}
		
		int i = 0;
		
		while (true) {
			
			System.out.println("i : " +i);
			i++;
			
			if (i == 3) {
				break;
			}
		}
	}

}
