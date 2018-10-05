package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 345;
		int y = 2;
		
		double z = x / y;
		
		System.out.println(z);
		
		int remainder = x % y;  //modulus operator gets us the remainder 
		
		System.out.println("the remainder is : " + remainder);
		
		if (x % 2 ==0) {
			System.out.println("EVEN");
			
		}else {
			System.out.println("ODD");
			
			System.out.print(x + " is not disvible by 3. ");
			
			System.out.print(x + " is disvible by 3. ");
			
		}
		
		for (int counter = 0; counter <100; counter++) {
			if (counter % 9 == 0) {
				System.out.print(counter);
			}
		}
		
		
	}

}
