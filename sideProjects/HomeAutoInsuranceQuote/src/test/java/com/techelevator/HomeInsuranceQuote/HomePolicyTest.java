package com.techelevator.HomeInsuranceQuote;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.MathContext;

import org.junit.Test;

public class HomePolicyTest {
	
	HomePolicy newPolicy = new HomePolicy();
	String policy = "";
	BigDecimal mv = new BigDecimal(0);
	BigDecimal rc = new BigDecimal(0);
	MathContext onePlace = new MathContext(1);
	MathContext sevenPlaces = new MathContext(7);

	@Test
	public void testIfPolicyIsHomeowners() {
		String actual = newPolicy.findPolicyType("homeowners");
		String expected = "HO-1";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsPerilPolicy() {
		String actual = newPolicy.findPolicyType("peril policy");
		String expected = "HO-2";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsPersonalBelongings() {
		String actual = newPolicy.findPolicyType("personal belongings");
		String expected = "HO-3";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsPersonalBelongingsDeluxe() {
		String actual = newPolicy.policyIsDeluxe("HO-3", true);
		String expected = "HO-3 Deluxe";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsPersonalProperty() {
		String actual = newPolicy.findPolicyType("personal property");
		String expected = "HO-4";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsComprehensive() {
		String actual = newPolicy.findPolicyType("comprehensive");
		String expected = "HO-5";
		assertEquals(expected, actual);
	}

	@Test
	public void testIfPolicyIsCondoCoOp() {
		String actual = newPolicy.findPolicyType("condo / co-op");
		String expected = "HO-6";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPolicyIsMobileHome() {
		String actual = newPolicy.findPolicyType("mobile home");
		String expected = "HO-7";
		assertEquals(expected, actual);
	}

	@Test
	public void testIfPolicyIsBasicPeril() {
		String actual = newPolicy.findPolicyType("basic peril");
		String expected = "HO-8";
		assertEquals(expected, actual);
	}
	
	// Need to tweak comparators in findEligibility() to properly correlate test results
	@Test
	public void testHomeownersPolicyElegibilitySuccess() {
		policy = "HO-1";
		mv = new BigDecimal(90000);
		rc = new BigDecimal(100000);
		boolean actual = newPolicy.findEligibility(policy, mv, rc);
		assertTrue(actual);
	}
	
	@Test
	public void testPBDeluxeEligibilitySuccess() {
		policy = "HO-3 Deluxe";
		mv = new BigDecimal(90000);
		rc = new BigDecimal(100000);
		boolean actual = newPolicy.findEligibility(policy, mv, rc);
		assertTrue(actual);
	}
	// ^^previous two tests are in same part of method
	
	@Test
	public void testPerilPolicyIsEligibilitySuccess() {
		policy = "HO-2";
		mv = new BigDecimal(60000);
		rc = new BigDecimal(100000);
		boolean actual = newPolicy.findEligibility(policy, mv, rc);
		assertTrue(actual);
	}
	
	@Test
	public void testPBBasicEligibilitySuccess() {
		policy = "HO-3";
		mv = new BigDecimal(60000);
		rc = new BigDecimal(100000);
		boolean actual = newPolicy.findEligibility(policy, mv, rc);
		assertTrue(actual);
	}
	
	// Need to tweak comparators & values in findEligibility() to properly correlate test results
	@Test
	public void testBasicPerilEligibilitySuccess() {
		mv = new BigDecimal(59999.99);
		rc = new BigDecimal(100000.00);
		boolean actual = newPolicy.findEligibility(policy, mv, rc);
		assertFalse(actual);
	}
	
}
