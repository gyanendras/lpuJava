package com.lpu.shape;
/*
 * There would be exceptional logic 
 * to handle that you have to create a Exception class by 
 * extending Exception.
 * Then you have to throw where that exceptional logic comes
 * in the method.
 * All methods who are throwing any exception
 * they have to declare it.
 * OR they have to catch it.
 */
public class UnPrintableException extends Exception {
	UnPrintableException(String message){
		super(message);
	}

}
