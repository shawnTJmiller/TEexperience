package com.techelevator.HomeInsuranceQuote;

import java.math.BigDecimal;

public class HomePolicy {

	private BigDecimal marketValue;
	private BigDecimal replacementCost;
	private BigDecimal highestEligPercent = new BigDecimal(0.9);
	private BigDecimal midEligPercent = new BigDecimal(0.6);
	private String policy;
	private boolean isDeluxe;
	private boolean isHomeowners;

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public BigDecimal getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public BigDecimal getHighestEligPercent() {
		return highestEligPercent;
	}

	public void setHighestEligPercent(BigDecimal highestEligibility) {
		this.highestEligPercent = highestEligibility;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public boolean isDeluxe() {
		return isDeluxe;
	}

	public void setDeluxe(boolean isDeluxe) {
		this.isDeluxe = isDeluxe;
	}

	public boolean isHomeowners() {
		return isHomeowners;
	}

	public void setHomeowners(boolean isHomeowners) {
		this.isHomeowners = isHomeowners;
	}

	public String policyIsDeluxe(String policy, boolean isDeluxe) {
		if (isDeluxe) {
			return policy + " Deluxe";
		}
		return policy;
	}

	public String findPolicyType(String userInput) {
		if (userInput.equals("homeowners")) {
			policy = "HO-1";
		} else if (userInput.equals("peril policy")) {
			policy = "HO-2";
		} else if (userInput.equals("personal belongings")) {
			policy = "HO-3";
		} else if (userInput.equals("personal property")) {
			policy = "HO-4";
		} else if (userInput.equals("comprehensive")) {
			policy = "HO-5";
		} else if (userInput.equals("condo / co-op")) {
			policy = "HO-6";
		} else if (userInput.equals("mobile home")) {
			policy = "HO-7";
		} else if (userInput.equals("basic peril")) {
			policy = "HO-8";
		} else
			policy = null;
		return policy;
	}

	public boolean findEligibility(String policy, BigDecimal marketValue, BigDecimal replacementCost) {
		if (policy.equals("HO-1") || policy.equals("HO-3 Deluxe")) {
			if (marketValue.divide(replacementCost).compareTo(highestEligPercent) <= 0) { // something strange with comparator
				return true;
			}
		} else if (policy.equals("HO-2") || policy.equals("HO-3")) {
			if (marketValue.divide(replacementCost).compareTo(midEligPercent) >= 0) {
				return true;
			}
		} else if (policy.equals("HO-8")) {
			if (marketValue.divide(replacementCost).compareTo(midEligPercent) <= 0) { // something strange goind on with comparator & value after
				return true;
			}
		} return false;
	}

}
