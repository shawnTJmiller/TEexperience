package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Testing in progress...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...testing complete.");
	}

	@Test
	public void edgeContainsCorrectLength() {
		Edge thisEdge = new Edge(5);
		assertEquals(5, thisEdge.getLength());
	}
	
	@Test
	public void rectangleAreaIsCorrect() {
		Shape thisRectangle = new Rectangle(2, 3);
		boolean areasEqual = (thisRectangle.calculateArea() == 6);
		assertEquals(true, areasEqual);
	}
	
	@Test
	public void triangleAreaIsCorrect() {
		Shape thisTriangle = new Triangle(5, 2);
		boolean areasEqual = (thisTriangle.calculateArea() == 5);
		assertEquals(true, areasEqual);
	}
	
	@Test
	public void circleAreaIsCorrect() {
		Shape thisCircle = new Circle(1);
		double expectedArea = Math.PI * Math.pow(1, 2);
		boolean areasEqual = (thisCircle.calculateArea() == expectedArea);
		assertEquals(true, areasEqual);
	}
	
	

}
