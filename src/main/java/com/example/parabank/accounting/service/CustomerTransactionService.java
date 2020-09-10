package com.example.parabank.accounting.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.parabank.accounting.model.Accounts;
import com.example.parabank.accounting.model.Transaction;

@Service
public class CustomerTransactionService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Transaction> getTransactionsForAUser(Integer id) {
		return restTemplate
				.getForObject("http://parabank.parasoft.com/parabank/services/bank/customers" + id + "/accounts",
						Accounts.class)
				.getAccounts().stream()
				.map(account -> restTemplate.getForObject("http://parabank.parasoft.com/parabank/services/bank/accounts"
						+ account.getId() + "/transactions", Transaction.class))
				.collect(Collectors.toList());

	}
}
