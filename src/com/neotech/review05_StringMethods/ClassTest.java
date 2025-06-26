package com.neotech.review05_StringMethods;

public class ClassTest {
	public static void main(String[] args) {
		
		Class b = new Class();
		
		b.addTwoNumbers();
		
	
		b.addMineTwoNumbers(12, 17);
		
	
		int res = b.addTwoNumbersWithResult();
	
        System.out.println(res);
	
	    if (res>10) {
		System.out.println("Good job!");
	}
	}

}
