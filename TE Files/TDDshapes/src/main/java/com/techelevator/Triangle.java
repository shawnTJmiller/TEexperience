package com.techelevator;

public class Triangle implements Shape {

	Edge base;
	Edge width;
	
	public Triangle(int base, int width) {
		this.base = new Edge(base);
		this.width = new Edge(width);
	}
	
	
	@Override
	public double calculateArea() {
		return 0.5 * base.getLength() * width.getLength();
	}

}
