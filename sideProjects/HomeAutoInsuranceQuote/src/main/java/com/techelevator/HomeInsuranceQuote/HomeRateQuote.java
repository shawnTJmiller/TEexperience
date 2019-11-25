package com.techelevator.HomeInsuranceQuote;

import java.math.BigDecimal;

public class HomeRateQuote {
	
	private BigDecimal minPremium;
	private int returnCreditPercent;
	private int premiumDiscountPercent;
	private boolean isNonSmoker;
	private boolean hasAutoIns;
	private boolean hasLocalAlarm;
	private boolean hasPDFDAlarm;
	private boolean hasCentralAlarm;
	private boolean hasDeadBolt;
	private boolean hasFireExtinguisher;


	HomePolicy newPolicy = new HomePolicy();

	
	public BigDecimal getMinPremium() {
		return minPremium;
	}
	
	public void setMinPremium(BigDecimal minPremium) {
		this.minPremium = minPremium;
	}
	
	public int getReturnCreditPercent() {
		return returnCreditPercent;
	}

	public void setReturnCreditPercent(int returnCreditPercent) {
		this.returnCreditPercent = returnCreditPercent;
	}

	public int getPremiumDiscountPercent() {
		return premiumDiscountPercent;
	}

	public void setPremiumDiscountPercent(int premiumDiscountPercent) {
		this.premiumDiscountPercent = premiumDiscountPercent;
	}

	public boolean isNonSmoker() {
		return isNonSmoker;
	}

	public void setNonSmoker(boolean isNonSmoker) {
		this.isNonSmoker = isNonSmoker;
	}

	public boolean isHasAutoIns() {
		return hasAutoIns;
	}

	public void setHasAutoIns(boolean hasAutoIns) {
		this.hasAutoIns = hasAutoIns;
	}

	
	public BigDecimal findPremiumMinimum(String policy) {
		if (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-8")) {
			minPremium = new BigDecimal(350);
		} else if (policy.equals("HO-4")) {
			minPremium = new BigDecimal(150);
		} else if (policy.equals("HO-6")) {
			minPremium = new BigDecimal(200);
		}
		return minPremium;
	}

	public int accountCreditWithAutoDiscount(boolean hasAutoIns, String policy) {
		if (hasAutoIns) {
			if (policy.equals("HO-2") || policy.contentEquals("HO-3") || policy.contentEquals("HO-6")) {
				returnCreditPercent = 22;
			} else if (policy.contentEquals("HO-4")) {
				returnCreditPercent = 33;
			}
		}
		return returnCreditPercent;
	}

	public int PremiumNonSmoker(boolean isNonSmoker, String policy) {
		if (isNonSmoker && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 1;
		return premiumDiscountPercent;
	}

	public int PremiumHasLocalAlarm(boolean hasLocalAlarm, String policy) {
		if (hasLocalAlarm && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 1;
		return premiumDiscountPercent;
	}

	public int PremiumHasPDFDAlarm(boolean hasPDFDAlarm, String policy) {
		if (hasPDFDAlarm && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 2;
		return premiumDiscountPercent;
	}

	public int PremiumHasCentralAlarm(boolean hasCentralAlarm, String policy) {
		if (hasCentralAlarm && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 5;
		return premiumDiscountPercent;
	}

	public int PremiumHasDeadBolt(boolean hasDeadBolt, String policy) {
		if (hasDeadBolt && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 1;
		return premiumDiscountPercent;
	}

	public int PremiumHasFireExtinguisher(boolean hasFireExtinguisher, String policy) {
		if (hasFireExtinguisher && (policy.equals("HO-2") || policy.equals("HO-3") || policy.equals("HO-4") || policy.equals("HO-6")));
		premiumDiscountPercent += 1;
		return premiumDiscountPercent;
	}
	
}
