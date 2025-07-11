package com.neotech.review03;

public class MoreNumberPatterns {
	public static void main(String[] args) {

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 4; col >= row; col--) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5 - row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 4; col >= row; col--) {
				System.out.print(col);
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 4; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
