package com.ahmete._02_UserDefinedException2;

public class WrongChoiceException extends Exception{
	public WrongChoiceException() {
	}
	
	public WrongChoiceException(String message) {
		super(message);
	}
}