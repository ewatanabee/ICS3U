package com.bayviewglen.dayone;

public class ExampleOne {
	/*
	 * Introduction to the Strings Class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A string is a sequence of characters
		// A string of characters (think a string of beads or sequence of beads on a
		// string)

		// A string is a object type it is NOT Primitive
	String str = "This is a String";

	System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(1, 4));
		// ;[start, end)
		
		System.out.println(str.substring(8)); // [start, str.length)
		System.out.println(str.substring(8, str.length()));

		String name1 = "alpha";
	String name2 = "bet";

		System.out.println(name1.compareTo(name2));
		System.out.println(name2.compareTo(name1));
		System.out.println(name1.compareTo(name1));
		
		// if the two string have the same sequence of characters [compareTo returns 0]
		// if the string that activates on calls the method is greater than the string it was being compared to it returns positive 
		// Eg. "Jason".compareTo("Jackson") returns a postive int.
		
		// if the string that activates on calls the method is less than the string it was being compared to it returns negative
				// Eg. "Jackson".compareTo("Jason") returns a negative int.
		
		// Use the ASCII table to compare character (and strings)
		 
		String x = new String("hello");
		String y = new String("hello");
		
		System.out.println(x==y);
		
		System.out.print(x.compareTo(y) == 0);
		
		System.out.println(x.equals(y));
		
		
		
		System.out.println((int)'A' + 'A');
		
	}

}
