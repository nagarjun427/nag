package com.nag.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.account.dto.Account;
import com.nag.account.repository.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/")
	public String hellowWorld( ) {
		return "Welcome to Account Service!";
		
	}
	
	@RequestMapping("/accounts")
	public List<Account> getAllAccounts( ) {
		List<Account> accounts = accountRepository.findAll();
		return accounts;
		
	}
	
	@RequestMapping(value= "{accountName}")
	public Account getAccountByName(@PathVariable String accountName) {
		Account account = accountRepository.findByaccName(accountName);
		return account;
		
	}

}
