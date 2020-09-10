package com.example.parabank.accounting.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Accounts {

	private List<Account> transactions;
	public Accounts() {
		transactions = new ArrayList<>();
    }
	public List<Account> getAccounts() {
		return transactions;
	}
	
	
}
