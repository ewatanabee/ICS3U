package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleThree {
	/*
	 * Using the Scanner to read input from the user/keyboard
	 * 
	 * Prompt the user for 3 digit intger.
	 * 
	 * Display the sum of the three digits to the console.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Please type a 3 digit interger ");
		int number = input.nextInt();

		if (number > 999 || number < 100) {
			throw new IllegalArgumentException("The number must be 3 digits. ");

		}

		int digit1 = number / 100;
		int digit2 = number % 10;
		int digit3 = number % 100 / 10;

		int sum = digit1 + digit2 + digit3;

		System.out.println("The sum of the numbers in " + number + " is " + sum);

		input.close();

	}

}
