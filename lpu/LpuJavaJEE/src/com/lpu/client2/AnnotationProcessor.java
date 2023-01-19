package com.lpu.client2;

import java.lang.annotation.Annotation;

import com.lpu.anno.Graphics;
import com.lpu.shape.Triangle;

public class AnnotationProcessor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Triangle tr = new Triangle(2, 5, "MyTriangle");
		Class trClass = tr.getClass();
		Annotation[] anno = trClass.getAnnotations();
		Graphics gr = (Graphics) anno[0];
		String s = gr.intense();
		int val = gr.intensityValue();
		System.out.println
		 ("Set Graphics card to "+ s + " " +val);

	}

}
