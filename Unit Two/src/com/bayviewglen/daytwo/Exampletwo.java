package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Exampletwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Mile One:");
		String temp = in.nextLine();
		
		int minutes;
		double seconds;
		
		int colon = temp.indexOf(":");
		minutes = Integer.parseInt(temp.substring(0, colon));
		seconds = Double.parseDouble(temp.substring(colon+1));
		
		
		// assume minutes = 5
		// assume seconds = 34.221
		
		//total time = 334.221s
		// minutes * 60 + seconds
		
		
		
	}

}
