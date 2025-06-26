package com.neotech.review04;

public class Return {

	boolean isOdd(int num) {
		boolean result;
		if (num%2==1) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	boolean isOddE(int num) {
		return num%2 ==1;
		
	}
	
public static void main(String[] args) {
		
	Return m = new Return();
	
	boolean result = m.isOdd(9);
		System.out.println("The number 9 is odd? " + result );
	
		boolean result2 = m.isOddE(22);
		System.out.println(result2);
		
		System.out.println(m.isOdd(13));
}

}
