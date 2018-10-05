package com.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		final int NUMBER_OF_SIDES = 6;
		
		final int NUM_STUDENTS = 23;  //using constants makes coded easily to maintain and easier to read. 
		
		
		int[] students = new int[NUM_STUDENTS];  //don't freak about the array or for loop 
		int testScores = 0;
		for (int i=0; i<NUM_STUDENTS; i++) {
			testScores += students[i];
		}
		
		double average = testScores / (double)NUM_STUDENTS;
		
		// NUMBER_OF_SIDES = 8; cannot change the value after it was set to (final)
		// Naming convention for constants is UPPER_CASE_WITH_UNDERSCORES
		
		
		
		// hardcoded numbers are referred to as magic numbers             ^
		// we don't like magic numbers. Create a constant instead. at TOP |
		//                                                                |
		
		
		
	
		
		
		
		
		
	}

}
