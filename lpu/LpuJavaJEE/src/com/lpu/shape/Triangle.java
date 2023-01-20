package com.lpu.shape;

import com.lpu.anno.Graphics;
import com.lpu.shape.exceptions.NoColorException;
import com.lpu.shape.exceptions.PrinterCorruptedException;
import com.lpu.shape.exceptions.UnPrintableException;

@Graphics(intense="High", intensityValue=10)
public class Triangle extends Shape implements Comparable<Triangle>{

	
private double base;


private double height;

public Triangle(double b ,double h, String name){
super(name);
this.base=b;
this.height=h;
}

public double getArea(){
return 0.5*base*height;

}

public String getName() {
	return "Shape is "+ name;
}

public String getName(String prefix) {
	return prefix + name;
}

@Override
public boolean equals(Object obj) {
	Triangle tr2 = (Triangle)obj;
	boolean flag = this.base == tr2.base 
			       && this.height == tr2.height;
	return flag;
	
}

@Override
public int hashCode() {
	return (int)this.base + (int)this.height;
	
}

@Override
public String toString() {
	return this.base + " " + this.height + super.toString();
}

@Override
public int compareTo(Triangle o) {
	int size;
	if(this.base+this.height > o.base+o.height) {size =1;}
	else {size =-1;}
	
	if(this.equals(o)) {size = 0;}
	return size;
}

@Override
public void print() throws UnPrintableException,NoColorException {
	boolean badPrinter = false;
	if(badPrinter) {
		throw new PrinterCorruptedException("Printer is Corrupt");
		}
	if(base+height < 20) {
	System.out.println("printed " + name);
	}else throw new UnPrintableException("Size is Big "+ base +" " +height);
 
	if(color == null) {
	 throw new NoColorException("No Color specified");
 }
 }
 


}

