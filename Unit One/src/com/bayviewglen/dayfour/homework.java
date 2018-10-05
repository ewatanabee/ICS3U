package com.bayviewglen.dayfour;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Question 1
 
		Scanner input = new Scanner(System.in);

		int x;

		System.out.print("output the number in squared form : ");

		x = input.nextInt();

		double number = (x * x);

		System.out.println("the number in squared form is : " + number);

		input.close();
		
		*/

		
		
		/* Question 2
	
		Scanner input = new Scanner(System.in);
		
		int x;
		
		double y = 56;
		
		System.out.print("input your test score : ");
		
		x = input.nextInt();
		
		double number = (x / y);
		
		System.out.println("The percentage on your test is : " + number);
		
		input.close();
		
		 */
		
		/* Question 3
		 
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a 5 digit number now!! : ");
		
		int number = input.nextInt();
		
		int digit1 = number;
		int digit2 = number / 1000 % 10;
		int digit3 = number;
		int digit4 = number / 10 % 10;
		int digit5 = number;
		
		int sum = (digit2 + digit4);
		
		System.out.println("The sum of the numbers in " + number + " sum is:  " + sum);
		
		input.close();
		
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the velocity : ");
		
		 double Vi;
		 
		 Vi = input.nextDouble();
		 
		 System.out.println("Input the acceleration : ");
		 
		 double A;
		 
		 A = input.nextDouble();
		 
		 System.out.println("Input the time : ");
		 
		 double t;
		 
		 t = input.nextDouble();
		 
		 double finalvelocity = Vi + (A * t);
		 
		 System.out.println("The final velocity of your inputs is : " + finalvelocity);
		 
		 

		
	}

}
