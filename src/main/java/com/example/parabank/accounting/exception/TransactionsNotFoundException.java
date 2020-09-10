package com.example.parabank.accounting.exception;

public class TransactionsNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TransactionsNotFoundException(String message) {
		super(message);
	}

}
