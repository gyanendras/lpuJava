package com.lpu.shape;

public class Triangle2 extends Shape {
	private double base;
	private double height;

	public Triangle2(double b ,double h, String name){
	super(name);
	this.base=b;
	this.height=h;
	}

	public double getArea(){
	return 0.5*base*height;

	}

	public String getName() {
		return "In Tr2 Shape is "+ name;
	}

	public String getName(String prefix) {
		return prefix + name;
	}
}
