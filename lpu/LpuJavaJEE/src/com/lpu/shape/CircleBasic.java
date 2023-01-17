package com.lpu.shape;
// abstraction, inheritance,polymorphism,Encapsulation- Data Hiding, Data Binding)
/* Access specifiers - public - Anywhere, private - within class,
 * protected- within package and subclass , default - within package
 * Inheritance is a parent child relationship in classes.
   Super class and sub class relationship.
   Child is a parent, Circle is a Shape; Triangle is a shape
  
  Same method name and same parameters then its 
  method overriding(dynamic polymorphism), same method name and different parameters
  method overloading(compile polymorphism ).
  
  Object is superclass of all class;
  
  
  
 *
 *
 */
public class CircleBasic extends Shape { 
private double radius ;
private String color;



public CircleBasic(){
radius = 10.4;
}

public CircleBasic(double radius, String name){
	super(name);
	this.radius = radius;


}



public double getArea(){
double area = 0;
area = 3.14 *radius* radius; 
return area;
}
/*
public String getName() {
	return name;
}*/

public static void main(String[] args){
CircleBasic cb = new CircleBasic();
CircleBasic cb2 = new CircleBasic(11.5,"Circle");
CircleBasic cb3 = new CircleBasic(12.5, "Circle");
CircleBasic cb4 = new CircleBasic(14.5, "red");

double area = cb.getArea();
double area11 = cb2.getArea();
double area12 = cb3.getArea();

System.out.println("Area 10.5 is " + area);
System.out.println("Area 11.5 is " + area11);
System.out.println("Area 12.5 is " + area12);
}

}  
