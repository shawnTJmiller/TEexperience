package te.examples.MavenPractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PizzaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void thisPlainPizzaLooksGood() {
		
		Pizza plainPizza = new Pizza("square");
		String actualResult = plainPizza.getShape();
		String expectedResult = "square";
		Assert.assertEquals(expectedResult, actualResult);
	}

}
