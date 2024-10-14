//package com.project.staragile.banking;
package banking;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello from CBS Bank";
	}
	
	
	@PostMapping("/createAccount")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) {
	    if (account == null) {
	        // Log the issue using a logger (not using System.out.println)
	        // logger.warn("Account creation attempted with null or missing fields");
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // 400 Bad Request
	    }

	    Account createdAccount = accountService.createAccount(account);
	    
	    // Return the created account with a 201 Created status
	    return new ResponseEntity<>(createdAccount, HttpStatus.CREATED);
	}
	
	@PostMapping("/registerAccount")
	public Account registerAccount(@RequestBody Account account) {
		if(account != null) {
			return accountService.registerAccount(account);
		}
		System.out.println("post called");
		return account;
	}
	
	@GetMapping("/getAccount/{accountNumber}")
	public Account getAccountDetails(@PathVariable(value="accountNumber") int accountNumber) {
		System.out.println(accountNumber);
		Account account = accountService.getAccountDetails(accountNumber);
		return account;
	}

}