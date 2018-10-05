package com.bayviewglen.dayfour;

import java.util.Scanner;

/*
 * Declaring a Scanner to red input from the keyboard.
 * 
 * Reading double data
 * 
 * Calculate the Surface Area of a box.]
 * 
 * You must prompt the user of the length and width of the base and the height of the box - these can have a decimal
 * 
 * You can assume the box has a lid.
 */
public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter the length and width of the base:  ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		
		System.out.print("Please enter the height of the box:  ");
		double height = input.nextDouble();
		
		double surfaceArea = (length * width * height + length * width * height) * 2;
				
			System.out.println("/nThe Surface area of the box is:" + surfaceArea);
		
	}

}
