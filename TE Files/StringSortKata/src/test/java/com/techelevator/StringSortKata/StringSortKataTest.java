package com.techelevator.StringSortKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringSortKataTest {

	StringReader sr = new StringReader();
	
	@Test
	public void emptyStringShouldReturnEmptyString() {	//Start w/ easiest example

		String actualResult = sr.orderString("");
		assertEquals("", actualResult);
	}

	@Test
	public void singleWordIsReturned() {
		
		String actualResult = sr.orderString("T1he");
		assertEquals("T1he", actualResult);
	}
	
	@Test
	public void twoWordsReturnedInCorrectOrder() {
		
		String actualResult = sr.orderString("P2igeons T1he");
		assertEquals("T1he P2igeons", actualResult);
	}
	
	@Test
	public void fiveWordsReturnedInCorrectOrder() {
		
		String actualResult = sr.orderString("a5m I1 th2ink 4I the3refore");
		assertEquals("I1 th2ink the3refore 4I a5m", actualResult);
	}
	
}