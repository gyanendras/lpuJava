package com.lpu.client2;

import com.lpu.lambda.StringManip;

/*
 * Lambdas are anonymous functions that can be assigned to
 * Functional interface types i.e variables.
 *  and can be passed as parameter to other functions.
 *  https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
 *  
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

		String s = str.apply("abcdef", 4);
		System.out.println(s);

		lambdaClient lc = new lambdaClient();
		String s2 = lc.lambdaUse(str2, false);
		System.out.println(s2);
	}

}
