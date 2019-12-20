package com.techelevator;

public class Circle implements Shape {

	private Edge radius;
	
	public Circle(int radius) {
		this.radius = new Edge(radius);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius.getLength(), 2);
	}

}
