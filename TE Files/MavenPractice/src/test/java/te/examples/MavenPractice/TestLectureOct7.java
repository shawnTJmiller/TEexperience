package te.examples.MavenPractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestLectureOct7 {

	LectureOct7 myTestingExercise = new LectureOct7();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Testing in progress...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...testing completed.");
	}

	@Test
	public void test1() {

		String actualResult = myTestingExercise.theEnd("Elephant", true);
		String expectedResult = "E";
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void test2() {
		String actualResult = myTestingExercise.theEnd("Wombat", true);
		String expectedResult = "W";
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void test3() {
		String actualResult = myTestingExercise.theEnd("Pumpernickel", false);
		String expectedResult = "l";
		Assert.assertEquals(expectedResult, actualResult);
	}
}
