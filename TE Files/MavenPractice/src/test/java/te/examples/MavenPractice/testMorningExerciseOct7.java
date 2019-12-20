package te.examples.MavenPractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class testMorningExerciseOct7 {

	morningExerciseOct7 theEnd = new morningExerciseOct7();
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Testing in progress...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...testing complete.");
	}

	@Test
	public void testTheEndIfTrue() {
		String actualResult = theEnd.theEnd("Hello", true);
		String expectedResult = "H";
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testTheEndIfFalse() {
		String actualResult = theEnd.theEnd("Hello", false);
		String expectedResult = "o";
		Assert.assertEquals(expectedResult, actualResult);
		
	}
}
