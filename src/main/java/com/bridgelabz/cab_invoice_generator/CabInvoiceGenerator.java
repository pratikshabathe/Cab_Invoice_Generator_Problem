package com.bridgelabz.cab_invoice_generator;

public class CabInvoiceGenerator {

	private  static final int MINIMUM_COST_PER_KILOMETER = 10;
	private static final int COST_PER_TIME = 1;

	//creating calculateFare method to calculate the fare for the given distance and time
	public static double calculateFare(double distance, int time) {
        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
    }

	//creating calculateFare method with multiple rides
    public double calculateFareForMultipleRides(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {  //Iterate over the rides
            totalFare = calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }

    public static void main(String[] args) {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        System.out.println("Total fair is : " +calculateFare(4.0, 10));
        System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
    }
}
