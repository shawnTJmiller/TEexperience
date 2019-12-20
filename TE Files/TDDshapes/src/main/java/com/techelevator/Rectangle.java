package com.techelevator;

public class Rectangle implements Shape {

	Edge base;
	Edge width;
	
	public Rectangle(int base, int width) {
		this.base = new Edge(base);
		this.width = new Edge(width);
	}

	@Override
	public double calculateArea() {
		return this.base.getLength() * this.width.getLength();
	}

	
	
}
