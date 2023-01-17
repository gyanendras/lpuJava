package com.lpu.shape;

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



}

