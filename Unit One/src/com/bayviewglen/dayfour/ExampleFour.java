package com.bayviewglen.dayfour;

/*
 * Short cut Assignment Operators 
 */
public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 7;
		int y = 10;
		/*
		 * System.out.println(x++); //does the System.out than the ++ (add 1)
		 * System.out.println(x);
		 * 
		 * System.out.println(++y); // Does the ++ than the System.out
		 * System.out.println(y);
		 */

		int sum = ++x + y;

		System.out.println(x); // 8
		System.out.println(y); // 10
		System.out.println(sum); // 10

		// x++ is the same as x = x +1;

		x = x + 3; //adding

		x += 3;    //adding

		x -= 3;    //subtracting

		x *= 3;   //multiplication

		x /= 3;  //division

		x %= 3;  //module 

		// --subtracts 1
	}

}
