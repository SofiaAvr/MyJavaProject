package com.neotech.review05_StringMethods;

public class Task1 {
	public static void main(String[] args) {
		
		String ssn = "815-273-5061";
		
		String newSSN = ssn.substring(0,8).replaceAll("[0-9]", "*");
		String ssnLast = ssn.substring(8, 12);
		System.out.println(newSSN + ssnLast);
		
		// Split method
		
		String[] parts = ssn.split("-");
		
		parts[0] = parts[0].replaceAll("[0-9]", "*");
		parts[1] = parts[1].replaceAll("[0-9]", "*");
		
		String maskedSSN = parts[0] + "-" + parts[1] + "-" + parts[2];
		System.out.println(maskedSSN);
	}

}
