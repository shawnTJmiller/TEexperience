package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {

	Drink testChip = new Drink("U2", "Thirsty", 1.99, "Drink");

	@Test
	public void testGetSlotId() {
		String actualResult = testChip.getSlotId();
		Assert.assertEquals("U2", actualResult);
	}

	@Test
	public void testSetSlotId() {
		testChip.setSlotId("U5");
		String actualResult = testChip.getSlotId();
		Assert.assertEquals("U5", actualResult);
	}

	@Test
	public void testGetItemName() {
		String actualResult = testChip.getItemName();
		Assert.assertEquals("Thirsty", actualResult);
	}

	@Test
	public void testSetItemName() {
		testChip.setItemName("Sweat");
		String actualResult = testChip.getItemName();
		Assert.assertEquals("Sweat", actualResult);
	}

	@Test
	public void testGetPrice() {
		double actualResult = testChip.getPrice();
		Assert.assertEquals(1.99, actualResult, 0.00);
	}

	@Test
	public void testSetPrice() {
		testChip.setPrice(19.75);
		double actualResult = testChip.getPrice();
		Assert.assertEquals(19.75, actualResult, 0.00);
	}

	@Test
	public void testGetItemType() {
		String actualResult = testChip.getItemType();
		Assert.assertEquals("Drink", actualResult);
	}

	@Test
	public void testSetItemType() {
		testChip.setItemType("Body Fluid");
		String actualResult = testChip.getItemType();
		Assert.assertEquals("Body Fluid", actualResult);
	}

	@Test
	public void testGetQuantity() {
		int actualResult = testChip.getQuantity();
		Assert.assertEquals(5, actualResult);
	}

	@Test
	public void testSetQuantity() {
		testChip.setQuantity(1000000000);
		int actualResult = testChip.getQuantity();
		Assert.assertEquals(1000000000, actualResult);
	}

}
