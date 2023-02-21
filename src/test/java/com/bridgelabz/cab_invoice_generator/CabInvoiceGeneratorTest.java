package com.bridgelabz.cab_invoice_generator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void  givenDistanceAndTime_ShouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();  //creating object of cabInvoiceGenerator class
		double distance = 5.0;
		int time = 10;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);  //using object reference calling calculateFare method with parameters
		Assert.assertEquals(60.0, fare);  //verifies that the expected and actual values are equal
		}
}
