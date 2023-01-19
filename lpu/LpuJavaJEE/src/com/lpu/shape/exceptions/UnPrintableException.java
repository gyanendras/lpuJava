package com.lpu.shape.exceptions;
/*
 * There would be exceptional logic 
 * to handle that you have to create a Exception class by 
 * extending Exception.
 * Then you have to throw where that exceptional logic comes
 * in the method.
 * All methods who are throwing any exception
 * they have to declare it using throws.
 * OR they have to catch it using try catch finally or try and 
 * finally.
 * Extending Exception class gives you checked exception,
 * i.e either method declares by throws or you try catch.
 * 
 * Extend RuntimeException and these are unchecked
 * Not supposed to be catched , program is supposed to
 * terminate there an then.
 * 
 */
public class UnPrintableException extends Exception {
	public UnPrintableException(String message){
		super(message);
	}

}
