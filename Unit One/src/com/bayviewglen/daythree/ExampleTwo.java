package com.bayviewglen.daythree;

public class ExampleTwo {
	
	// Interger Division 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 83150;
		
		//add the invidiual digits in the number and display the sum to the screen. 
		
		int digit1 = number / 10000; //8
		int digit5 = number % 10;  //0
		int digit2 = number / 1000 % 10; //3  (number / 1000) = 31 % 10 = 3
		int digit3 = number / 100 % 10; //1 (number / 100) = 831 % 10 = 1
		int digit4 = number % 100 / 10; //7 (number % 100) = 78 / 10 = 5
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5; 
		
		System.out.println("The sum is the digits in " + number + " is: " + sum);  //The sum is the digits in 83150 is: 17
		
		
		
		
	}

}
