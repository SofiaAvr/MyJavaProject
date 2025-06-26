package com.neotech.review02;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double d1 = input.nextDouble();
				

	    System.out.println("Please enter the second number:");
		double d2 = input.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
        String op = input.next();

		double result = 0;
		
		switch (op) {
		case "+" :
			result = d1+d2;
			break;
		case "-" :
			result = d1-d2;
			break;
		case "*" :
			result = d1*d2;
			break;
		case "/" :
			break;
			default:
				System.out.println("Invalid operator");
		}
		
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))

			System.out.println("The result is : " + result);
		
		input.close();
	} 
	
	

}
