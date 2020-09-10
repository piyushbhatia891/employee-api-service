package com.example.parabank.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parabank.accounting.model.Transaction;
import com.example.parabank.accounting.model.Transactions;
import com.example.parabank.accounting.service.CustomerTransactionService;

@RestController
@RequestMapping("/customers/v1")
public class CustomerTransactionController {
	
	@Autowired
	private CustomerTransactionService customerTransactionService;
	@GetMapping("/{customerId}/transactions")
	public List<Transaction> getTransactionsForAUser(@PathVariable("customerId")String customerId) {
		Transactions transactions= customerTransactionService.getTransactionsForAUser(Integer.parseInt(customerId));
		return transactions.getTransactions();
	}

}
