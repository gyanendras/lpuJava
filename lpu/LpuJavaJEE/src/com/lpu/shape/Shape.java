package com.lpu.shape;

public class Shape implements Art,Spinnable {
	protected String name;
	public Shape(){
		name = "ShapeDefault";
	}
	
	
	public Shape(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String draw(String shape) {
		return "draw";
	}
	
	public String animate(String shape) {
		return "moving";
	}

	
	public void print() throws UnPrintableException {
		System.out.println("printed " + name);
	}

	@Override
	public void spin() {
		System.out.println("Spinning");
	}
}
