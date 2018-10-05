/**
 * 
 */
package com.bayviewglen.daytwo;


public class Exampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 712;
		
		System.out.println("This is the number: " + x);
		
		System.out.printf("This is the number: %d\n", x);
		
		System.out.println();
		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	
		
		double a = 1.4456784;
		double b = 4.542378;
		
		double c  = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
	
		System.out.println();
		
		double num =-4.5;
		System.out.printf("%+4.5f\n", num);
		
		System.out.println();
		
		int minutes = 5;
		double seconds = 34.2;
		
		System.out.printf("%1d:%4.3f\n",minutes, seconds);
		
		String name = "Ethan";
		
		System.out.println();
		
		System.out.printf("Hello %s, how are you today?", name);
	}
}
