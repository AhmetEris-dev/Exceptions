package com.ahmete._01_UserDefinedException;
// : checked Exception yapmak isterseniz Exception sınıfından extend edebilirsiniz.
// : Eğer unchecked olmasını istersem RuntimeException sınıfından extend edebiliriz.
public class NotOutOfBoundsException extends Exception {
	public NotOutOfBoundsException() {
		super();
	}
	
	public NotOutOfBoundsException(String message) {
		super(message);
	}
	
}