package com.bridgelabz.cab_invoice_generator;

public class Ride {

	 private final double distance;
	 private final int time;
	 private String rideType;
	 
	 public Ride(double distance, int time, String string) {
	    	//The "this" keyword is used to refer to the current object
	        this.distance = distance;
	        this.time = time;
	        this.rideType = rideType;
	    }

	    public double getDistance() {
	        return distance;
	    }

	    public int getTime() {
	        return time;
	    }
	    public String getRideType() {
	        return rideType;
	    }
}
