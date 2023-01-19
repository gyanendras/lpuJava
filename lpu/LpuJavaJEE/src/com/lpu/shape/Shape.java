package com.lpu.shape;

import com.lpu.shape.exceptions.NoColorException;
import com.lpu.shape.exceptions.UnPrintableException;

public class Shape implements Art,Spinnable {
	protected String name;
	protected String color;
	
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
	
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() throws UnPrintableException,NoColorException {
		System.out.println("printed " + name);
	}

	@Override
	public void spin() {
		System.out.println("Spinning");
	}
}
