package com.bayviewglen.daytwo;

public class Testtable {

	public static void main(String[] args) {
		String splitone = "Split One"; 
		String splittwo = "Split Two";
		String splitthree = "String Three";
		String summary = "Summary of the 5 runners";
		String fName = "Steve";
		String lName = "Henri";
		
		int minutes1 = 5;
		double seconds1 = 2.3;
		int minutes2 = 10;
		double seconds2 = 12.3;
		int minutes3 = 15; 
		double seconds3 = 12.3;
		
		System.out.printf("%s\n\n",summary);
		System.out.printf("%-20s%15s%15s%15s", "Runner", splitone, splittwo, splitthree);
		System.out.printf("\n");
		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f", fName + " " + lName, minutes1, seconds1, minutes2, seconds2, minutes3, seconds3);
	}

}
