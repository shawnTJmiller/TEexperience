package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;


public class CandyTest {

	Candy testCandy = new Candy("Z9", "Zbar", 9.99, "Candy");

	@Test
	public void testGetSlotId() {
		String actualResult = testCandy.getSlotId();
		Assert.assertEquals("Z9", actualResult);
	}

	@Test
	public void testSetSlotId() {
		testCandy.setSlotId("Y4");
		String actualResult = testCandy.getSlotId();
		Assert.assertEquals("Y4", actualResult);
	}

	@Test
	public void testGetItemName() {
		String actualResult = testCandy.getItemName();
		Assert.assertEquals("Zbar", actualResult);
	}

	@Test
	public void testSetItemName() {
		testCandy.setItemName("Dank");
		String actualResult = testCandy.getItemName();
		Assert.assertEquals("Dank", actualResult);
	}

	@Test
	public void testGetPrice() {
		double actualResult = testCandy.getPrice();
		Assert.assertEquals(9.99, actualResult, 0.00);
	}

	@Test
	public void testSetPrice() {
		testCandy.setPrice(100.45);
		double actualResult = testCandy.getPrice();
		Assert.assertEquals(100.45, actualResult, 0.00);
	}

	@Test
	public void testGetItemType() {
		String actualResult = testCandy.getItemType();
		Assert.assertEquals("Candy", actualResult);
	}

	@Test
	public void testSetItemType() {
		testCandy.setItemType("Dynamite");
		String actualResult = testCandy.getItemType();
		Assert.assertEquals("Dynamite", actualResult);
	}

	@Test
	public void testGetQuantity() {
		int actualResult = testCandy.getQuantity();
		Assert.assertEquals(5, actualResult);
	}

	@Test
	public void testSetQuantity() {
		testCandy.setQuantity(1000);
		int actualResult = testCandy.getQuantity();
		Assert.assertEquals(1000, actualResult);
	}

}
