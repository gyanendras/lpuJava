package com.lpu.client2;

import java.util.function.BiFunction;

import com.lpu.lambda.StringManip;

/*
 * Lambdas are anonymous functions that can be assigned to
 * Functional interface types i.e variables.
 *  and can be passed as parameter to other functions.
 *  https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
 *  https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/function/package-summary.html
 */
public class lambdaClient {
	
	

    

	String lambdaUse(StringManip sm, boolean flag) {
		return flag + sm.apply("hello", 34);
	}
	
	public static void main(String[] args) {
		StringManip str = (a, b) -> {
			return a.substring(0, b);
		};
		
		StringManip str2 = (a,b)-> a+b;

		StringManip str3 =(a,b)->a.toUpperCase()+b;

        BiFunction<String, Integer, String> biFunc 
        = (a,b)->a.toUpperCase()+b;
		
        System.out.println(biFunc.apply("BIFunction", 33));
        
		String s = str.apply("abcdef", 4);
		System.out.println(s);

		lambdaClient lc = new lambdaClient();
		String s2 = lc.lambdaUse(str2, false);
		System.out.println(s2);
	}

}
