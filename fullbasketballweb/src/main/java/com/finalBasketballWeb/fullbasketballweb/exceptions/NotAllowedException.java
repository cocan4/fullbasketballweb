package com.finalBasketballWeb.fullbasketballweb.exceptions;

public class NotAllowedException extends Exception {

	public NotAllowedException(String message) {
		super("operation not allowed - - -> "+message);
		
	}

}
