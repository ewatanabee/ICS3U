package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Crosscountry {

	public static void main(String[] args) {
		// RUNNER 1

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Runner's name (first, last) : ");
		String temp = input.nextLine();
		int space = temp.indexOf(" ");
		String fName1 = temp.substring(0, space);
		String lName1 = temp.substring(space + 1);

		System.out.print("Enter your time to end Mile One (mm:ss:sss) : ");
		temp = input.nextLine();
		int colon = temp.indexOf(":");
		int minutesMile1Run1 = Integer.parseInt(temp.substring(0, colon));
		double secondsMile1Run1 = Double.parseDouble(temp.substring(colon + 1));
		double mile1InSeconds = minutesMile1Run1 * 60 + secondsMile1Run1;

		System.out.print("Enter your time to end Mile Two (mm:ss:sss) : ");
		temp = input.nextLine();
		colon = temp.indexOf(":");
		int minutesMile2Run1 = Integer.parseInt(temp.substring(0, colon));
		double secondsMile2Run1 = Double.parseDouble(temp.substring(colon + 1));
		double mile2InSeconds = minutesMile2Run1 * 60 + secondsMile2Run1;

		System.out.print("Enter your time to end the 5km (mm:ss:sss) : ");
		temp = input.nextLine();
		colon = temp.indexOf(":");
		int minutesFinishRun1 = Integer.parseInt(temp.substring(0, colon));
		double secondsFinishRun1 = Double.parseDouble(temp.substring(colon + 1));
		double mile3InSeconds = minutesFinishRun1 * 60 + secondsFinishRun1;

		// We have all the times in seconds

		double split2TotalSeconds = mile2InSeconds - mile1InSeconds;
		int minutesSplit2Run1 = (int) split2TotalSeconds / 60;
		double secondsSplit2Run1 = split2TotalSeconds - minutesSplit2Run1 * 60;

		double split3TotalSeconds = mile3InSeconds - mile2InSeconds;
		int minutesSplit3Run1 = (int) split3TotalSeconds / 60;
		double secondsSplit3Run1 = split3TotalSeconds - minutesSplit3Run1 * 60;

		double totalRun1Seconds = mile1InSeconds + mile2InSeconds + mile3InSeconds;
		int minutesRun1 = (int) totalRun1Seconds / 60;
		double secondsRun1 = totalRun1Seconds - minutesRun1 * 60;

		System.out.printf("\n");
		System.out.println("Run One Summary");
		System.out.println("***************");
		System.out.printf("\n");

		System.out.printf("The time of your first split was : %d:%06.3f\n", minutesMile1Run1, secondsMile1Run1);
		System.out.printf("The time of your second split was : %d:%06.3f\n", minutesSplit2Run1, secondsSplit2Run1);
		System.out.printf("The time of your third split was : %d:%06.3f\n", minutesSplit3Run1, secondsSplit3Run1);
		System.out.printf("The time of your first run was : %d:%06.3f\n", minutesFinishRun1, secondsFinishRun1);

		int run1minutes1 = minutesMile1Run1;
		double run1seconds1 = secondsMile1Run1;
		int run1minutes2 = minutesSplit2Run1;
		double run1seconds2 = secondsSplit2Run1;
		int run1minutes3 = minutesSplit3Run1;
		double run1seconds3 = secondsSplit3Run1;

		System.out.println("Please Enter Runner's name (first, last) : ");
		String temp2 = input.nextLine();
		int space2 = temp.indexOf(" ");
		String fName2 = temp.substring(0, space);
		String lName2 = temp.substring(space + 1);

		System.out.print("Enter your time to end Mile One (mm:ss:sss) : ");
		temp = input.nextLine();
		int colon2 = temp.indexOf(":");
		int minutesMile1Run2 = Integer.parseInt(temp.substring(0, colon));
		double secondsMile1Run2 = Double.parseDouble(temp.substring(colon + 1));
		double mile1InSecondsRun2 = minutesMile1Run1 * 60 + secondsMile1Run1;

		System.out.print("Enter your time to end Mile Two (mm:ss:sss) : ");
		temp = input.nextLine();
		colon = temp.indexOf(":");
		int minutesMile2Run2 = Integer.parseInt(temp.substring(0, colon));
		double secondsMile2Run2 = Double.parseDouble(temp.substring(colon + 1));
		double mile2InSecondsRun2 = minutesMile2Run1 * 60 + secondsMile2Run1;

		System.out.print("Enter your time to end the 5km (mm:ss:sss) : ");
		temp = input.nextLine();
		colon = temp.indexOf(":");
		int minutesFinishRun2 = Integer.parseInt(temp.substring(0, colon));
		double secondsFinishRun2 = Double.parseDouble(temp.substring(colon + 1));
		double mile3InSecondsRun2 = minutesFinishRun1 * 60 + secondsFinishRun1;

		// We have all the times in seconds

		double split2TotalSecondsRun2 = mile2InSecondsRun2 - mile1InSecondsRun2;
		int minutesSplit2Run2 = (int) split2TotalSecondsRun2 / 60;
		double secondsSplit2Run2 = split2TotalSecondsRun2 - minutesSplit2Run2 * 60;

		double split3TotalSecondsRun2 = mile3InSecondsRun2 - mile2InSecondsRun2;
		int minutesSplit3Run2 = (int) split3TotalSecondsRun2 / 60;
		double secondsSplit3Run2 = split3TotalSecondsRun2 - minutesSplit3Run2 * 60;

		double totalRun2Seconds = mile1InSecondsRun2 + mile2InSecondsRun2 + mile3InSecondsRun2;
		int minutesRun2 = (int) totalRun2Seconds / 60;
		double secondsRun2 = totalRun2Seconds - minutesRun2 * 60;

		String splitone = "Split One";
		String splittwo = "Split Two";
		String splitthree = "Split Three";
		String summary = "Summary of the 5 runners";

		System.out.printf("\n");
		System.out.println("Run One Summary");
		System.out.println("***************");
		System.out.printf("\n");

		System.out.printf("The time of your first split was : %d:%06.3f\n", minutesMile1Run2, secondsMile1Run2);
		System.out.printf("The time of your second split was : %d:%06.3f\n", minutesSplit2Run2, secondsSplit2Run2);
		System.out.printf("The time of your third split was : %d:%06.3f\n", minutesSplit3Run2, secondsSplit3Run2);
		System.out.printf("The time of your first run was : %d:%06.3f\n", minutesFinishRun2, secondsFinishRun2);

		System.out.printf("\n");
		System.out.printf("%s\n\n", summary);
		System.out.printf("%-20s%15s%15s%15s", "Runner", splitone, splittwo, splitthree);
		System.out.printf("\n");
		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f", fName1 + " " + lName1, run1minutes1, run1seconds1,
				run1minutes2, run1seconds2, run1minutes3, run1seconds3);
	}

}
