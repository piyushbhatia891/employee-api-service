package com.example.parabank.accounting.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.parabank.accounting.model.Transactions;

@Service
public class CustomerTransactionService {

	@Autowired
	private RestTemplate restTemplate;

	public Transactions getTransactionsForAUser(Integer id) {
		return restTemplate.getForObject("http://parabank.parasoft.com/parabank/services/bank/customers" + id,
				Transactions.class);
	}
}
