package com.example.parabank.accounting.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Transactions {

	private List<Transaction> transactions;
	public Transactions() {
		transactions = new ArrayList<>();
    }
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	
}
