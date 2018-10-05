package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleOne {

// Declaring a Scanner to read input from the keyboard
	// Reading interger data.
	// Prompt the user for three intergers and display the average of the three
	// numbers.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x, y, z;

		System.out.print("please enter three interges ");

		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();

		double average = (x + y + z) / 3.0;

		System.out.print("THe avearge of the three number is: " + average);

	}

}
