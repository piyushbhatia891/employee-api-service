package com.example.parabank.accounting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> handleWhenEmployeeNotFound(EmployeeNotFoundException exception) {
		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = TransactionsNotFoundException.class)
	public ResponseEntity<Object> handleWhenTransactionNotFound(TransactionsNotFoundException exception) {
		return new ResponseEntity<>("Transactions not found", HttpStatus.NOT_FOUND);
	}

}
