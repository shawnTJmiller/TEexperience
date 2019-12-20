package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

public class GumTest {

	Drink testChip = new Drink("Y1", "My Gums", 2000.37, "Gum");

	@Test
	public void testGetSlotId() {
		String actualResult = testChip.getSlotId();
		Assert.assertEquals("Y1", actualResult);
	}

	@Test
	public void testSetSlotId() {
		testChip.setSlotId("Y89");
		String actualResult = testChip.getSlotId();
		Assert.assertEquals("Y89", actualResult);
	}

	@Test
	public void testGetItemName() {
		String actualResult = testChip.getItemName();
		Assert.assertEquals("My Gums", actualResult);
	}

	@Test
	public void testSetItemName() {
		testChip.setItemName("Used and Chewy");
		String actualResult = testChip.getItemName();
		Assert.assertEquals("Used and Chewy", actualResult);
	}

	@Test
	public void testGetPrice() {
		double actualResult = testChip.getPrice();
		Assert.assertEquals(2000.37, actualResult, 0.00);
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
		Assert.assertEquals("Gum", actualResult);
	}

	@Test
	public void testSetItemType() {
		testChip.setItemType("Mushy Stuff");
		String actualResult = testChip.getItemType();
		Assert.assertEquals("Mushy Stuff", actualResult);
	}

	@Test
	public void testGetQuantity() {
		int actualResult = testChip.getQuantity();
		Assert.assertEquals(5, actualResult);
	}

	@Test
	public void testSetQuantity() {
		testChip.setQuantity(2345097);
		int actualResult = testChip.getQuantity();
		Assert.assertEquals(2345097, actualResult);
	}

}
