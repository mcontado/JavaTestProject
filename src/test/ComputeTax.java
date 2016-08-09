package test;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		final double RATE1 = 0.10; // Tax rates
		final double RATE2 = 0.15;
		final double RATE3 = 0.20;
		final double RATE4 = 0.25;

		final double S1 = 10000.00; // Tax brackets for single
		final double S2 = 25000.00;
		final double S3 = 50000.00; // Tax brackets for married

		double income = 0;
		double tax = 0;

		Scanner in = new Scanner(System.in); // Construct Scanner object

		System.out.print("Enter income = ");
		income = in.nextDouble(); // Read in next double into income

		if (income <= S1)
			tax = RATE1 * income;
		else if (income <= S2)
			tax = RATE1 * S1 
					+ RATE2 * (income - S1);
		else if (income <= S3) {
			tax = RATE1 * S1 
					+ RATE2 * (S2 - S1) 
					+ RATE3 * (income - S2);
		} else {
			tax = RATE1 * S1 
					+ RATE2 * (S2 - S1)
					+ RATE3 * (S3 - S2)
					+ RATE4 * (income - S3);
		}
			
		System.out.println("Tax = " + tax);

	}

}
