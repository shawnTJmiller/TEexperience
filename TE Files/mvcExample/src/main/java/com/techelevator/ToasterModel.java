package com.techelevator;

import java.math.BigDecimal;

public class ToasterModel {

	private int numberOfSlots;
	private String brand;
	private BigDecimal cost;
	
	public ToasterModel() {
		
	}
	
	public ToasterModel(int numberOfSlots, String brand, BigDecimal cost) {
		super();
		this.numberOfSlots = numberOfSlots;
		this.brand = brand;
		this.cost = cost;
	}
	
	public int getNumberOfSlots() {
		return numberOfSlots;
	}
	public void setNumberOfSlots(int numberOfSlots) {
		this.numberOfSlots = numberOfSlots;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
		
}
