package com.bridgelabz.cab_invoice_generator;

public class CabInvoiceGenerator {

	private  static final int MINIMUM_COST_PER_KILOMETER = 10;
	private static final int COST_PER_TIME = 1;

	//creating calculateFare method to calculate the fare for the given distance and time
	public static double calculateFare(double distance, int time) {       //parameterized method
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	}
	public static void main(String[] args) {
		System.out.println("Total fair is : " +calculateFare(5.0, 10));
	}
}
