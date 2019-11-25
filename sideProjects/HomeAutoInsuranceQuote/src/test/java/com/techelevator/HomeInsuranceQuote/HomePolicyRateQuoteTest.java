package com.techelevator.HomeInsuranceQuote;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class HomePolicyRateQuoteTest {

	HomeRateQuote RateQuote = new HomeRateQuote();
	HomePolicy policy = new HomePolicy();
	
	@Test
	public void testPremiumMinPersonalPropertyIs150() {
		BigDecimal actual = RateQuote.findPremiumMinimum("HO-4");
		BigDecimal expected = new BigDecimal(150);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumMinCondoCoOpIs200() {
		BigDecimal actual = RateQuote.findPremiumMinimum("HO-6");
		BigDecimal expected = new BigDecimal(200);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumPerilIs350() {
		BigDecimal actual = RateQuote.findPremiumMinimum("HO-2");
		BigDecimal expected = new BigDecimal(350);
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumPersonalPropertyIs350() {
		BigDecimal actual = RateQuote.findPremiumMinimum("HO-3");
		BigDecimal expected = new BigDecimal(350);
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumBasicPerilIs350() {
		BigDecimal actual = RateQuote.findPremiumMinimum("HO-8");
		BigDecimal expected = new BigDecimal(350);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHasAutoDiscountForPerilIsTwentyTwoPercent() {
		int actual = RateQuote.accountCreditWithAutoDiscount(true, "HO-2");
		int expected = 22;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHasAutoDiscountForPersonalBelongingsIsTwentyTwoPercent() {
		int actual = RateQuote.accountCreditWithAutoDiscount(true, "HO-3");
		int expected = 22;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHasAutoDiscountForCondoCoOpIsTwentyTwoPercent() {
		int actual = RateQuote.accountCreditWithAutoDiscount(true, "HO-6");
		int expected = 22;
		assertEquals(expected, actual);
	}

	@Test
	public void testHasAutoDiscountForPersonalPropertyIsThirtyThreePercent() {
		int actual = RateQuote.accountCreditWithAutoDiscount(true, "HO-4");
		int expected = 33;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumNonSmokerCreditForPerilIsOne() {
		int actual = RateQuote.PremiumNonSmoker(true, "HO-2");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumNonSmokerCreditForPersonalBelongingsIsOne() {
		int actual = RateQuote.PremiumNonSmoker(true, "HO-3");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumNonSmokerCreditForPersonalPropertyIsOne() {
		int actual = RateQuote.PremiumNonSmoker(true, "HO-4");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumNonSmokerCreditForCondoCoOpIsOne() {
		int actual = RateQuote.PremiumNonSmoker(true, "HO-6");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumLocalAlarmCreditForPerilIsOne() {
		int actual = RateQuote.PremiumHasLocalAlarm(true, "HO-2");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumLocalAlarmCreditForPersonalBelongingsIsOne() {
		int actual = RateQuote.PremiumHasLocalAlarm(true, "HO-3");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumLocalAlarmCreditForPersonalPropertyIsOne() {
		int actual = RateQuote.PremiumHasLocalAlarm(true, "HO-4");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumLocalAlarmCreditForCondoCoOpIsOne() {
		int actual = RateQuote.PremiumHasLocalAlarm(true, "HO-6");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumPDFDAlarmCreditForPerilIsTwo() {
		int actual = RateQuote.PremiumHasPDFDAlarm(true, "HO-2");
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumPDFDAlarmCreditForPersonalBelongingsIsTwo() {
		int actual = RateQuote.PremiumHasPDFDAlarm(true, "HO-3");
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumPDFDAlarmCreditForPersonalPropertyIsTwo() {
		int actual = RateQuote.PremiumHasPDFDAlarm(true, "HO-4");
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumPDFDAlarmCreditForCondoCoOpIsTwo() {
		int actual = RateQuote.PremiumHasPDFDAlarm(true, "HO-6");
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumCentralAlarmCreditForPerilIsFive() {
		int actual = RateQuote.PremiumHasCentralAlarm(true, "HO-2");
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumCentralAlarmCreditForPersonalBelongingsIsFive() {
		int actual = RateQuote.PremiumHasCentralAlarm(true, "HO-3");
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumCentralAlarmCreditForPersonalPropertyIsFive() {
		int actual = RateQuote.PremiumHasCentralAlarm(true, "HO-4");
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumCentralAlarmCreditForCondoCoOpIsFive() {
		int actual = RateQuote.PremiumHasCentralAlarm(true, "HO-6");
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumDeadBoltCreditForPerilIsOne() {
		int actual = RateQuote.PremiumHasDeadBolt(true, "HO-2");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumDeadBoltCreditForPersonalBelongingsIsOne() {
		int actual = RateQuote.PremiumHasDeadBolt(true, "HO-3");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumDeadBoltCreditForPersonalPropertyIsOne() {
		int actual = RateQuote.PremiumHasDeadBolt(true, "HO-4");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumDeadBoltCreditForCondoCoOpIsOne() {
		int actual = RateQuote.PremiumHasDeadBolt(true, "HO-6");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumFireExtinguisherCreditForPerilIsOne() {
		int actual = RateQuote.PremiumHasFireExtinguisher(true, "HO-2");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPremiumFireExtinguisherCreditForPersonalBelongingsIsOne() {
		int actual = RateQuote.PremiumHasFireExtinguisher(true, "HO-3");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumFireExtinguisherCreditForPersonalPropertyIsOne() {
		int actual = RateQuote.PremiumHasFireExtinguisher(true, "HO-4");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testPremiumFireExtinguisherCreditForCondoCoOpIsOne() {
		int actual = RateQuote.PremiumHasFireExtinguisher(true, "HO-6");
		int expected = 1;
		assertEquals(expected, actual);
	}

	
}
