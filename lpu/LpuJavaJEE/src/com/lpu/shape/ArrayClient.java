package com.lpu.shape;

import java.util.Arrays;

public class ArrayClient {

	public static void main(String[] args) {
		CircleBasic cb = new CircleBasic(5,"MyCircle");
		Triangle tr = new Triangle(2, 5,"MyTriangle0");
		
		Shape s = new CircleBasic(5,"MyCircle");
		Shape s2 =  new Triangle2(2, 3,"MyTriangle");
		Triangle t1 = new Triangle(2, 2,"MyTriangle1");
		Triangle t2 = new Triangle(2, 3,"MyTriangle2");
		
		Triangle [] trArr = new Triangle[3];
		trArr[0] = t1;
		trArr[1] = tr;
		trArr[2] = t2;
		Art art = new Triangle(21, 31,"MyTriangle1");
		Triangle tr3 = new Triangle(22, 31,"MyTriangle1");
		
		 Arrays.sort(trArr);
		
		art.animate("circle");
		tr3.getArea();
		
		for(int i =0; i < trArr.length; ++i ) {
			System.out.println(trArr[i]);
			System.out.println(trArr[i].getName());
		}
		
		
		String[] strArr = new String[5];
		
		for(int i =0; i < trArr.length; ++i ) {
			strArr[i] = "number "+ i;
		}
		
		for(int i = trArr.length; i>-1; --i ) {
			System.out.println(strArr[i]);
		}

	}

}
