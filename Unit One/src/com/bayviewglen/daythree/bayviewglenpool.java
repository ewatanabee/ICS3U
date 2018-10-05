package com.bayviewglen.daythree;

public class bayviewglenpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        final double l = 30;
        final double w = 16;
        final double h1 = 50;
        final double h2 = 51;
        final double l1 = 1;
        final double l3 = 5;
        final double cost = 2.00;
        double x; // angle between (h2 - h1) and hypotenuse

        double Ax, Ay1, Ay2, Az, V, SA, totalCost;
        x = Math.acos((h2 - h1) / l3);

        Ax = l * h1 + (h2 - h1) * l1 + (h2 - h1) * (l3 * Math.sin(x)) / 2;
        Ay1 = (w * h1);
        Ay2 = (w * h2);
        Az = l * w;

        SA = 2 * Ax + Ay1 + Ay2 + Az;

        System.out.println(SA);

        V = 0.90 * Ax * w;

        System.out.println(V);

        totalCost = SA * cost;

        System.out.println("$" + totalCost);

  }

}

