package com.lpu.client2;

import com.lpu.shape.Art;
import com.lpu.shape.CircleBasic;
import com.lpu.shape.Shape;
import com.lpu.shape.Triangle;
import com.lpu.shape.Triangle2;
import com.lpu.shape.UnPrintableException;

public class Client2 {

	public static void main(String[] args) throws UnPrintableException {
		
		
		CircleBasic cb = new CircleBasic(5, "MyCircle");
		Triangle tr = new Triangle(2, 5, "MyTriangle");

		Shape s = new CircleBasic(5, "MyCircle");
		Shape s2 = new Triangle(20, 3, "MyTriangle");
		Triangle t1 = new Triangle(2, 4, "MyTriangle");
		Triangle t2 = new Triangle(2, 3, "MyTriangle");
		Art a = new Triangle2(2, 3, "MyTriangleArt");
		a = new CircleBasic(5, "MyCircleArt");
		a = new Shape("ArtShape");

		boolean flag = false;
		flag = t1.equals(t2);
		int compare = t1.compareTo(t2);
		
		System.out.println("Compare " + compare);
		if (flag) {
			System.out.println("Boolean val is " + flag);
			System.out.println(t1);
			System.out.println(t2);
			System.out.println(t1.hashCode()+" "+ t2.hashCode());
		}else {
			System.out.println("Boolean val in else is " + flag);
		}
		

		System.out.println(s.getName());
		System.out.println(cb.getArea());

		System.out.println(s2.getName());
		System.out.println(tr.getArea());

		System.out.println(a.animate("fast"));
		
		s2.print();

	}

}
