//package com.project.staragile.banking;
package banking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Account createAccount(Account account) {
        // Validate the account object
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }

        if (account.getAccountNumber() <= 0) {
            throw new IllegalArgumentException("Account number must be a positive integer");
        }

        if (account.getAccountName() == null || account.getAccountName().isEmpty()) {
            throw new IllegalArgumentException("Account name cannot be null or empty");
        }

        if (account.getAccountType() == null || account.getAccountType().isEmpty()) {
            throw new IllegalArgumentException("Account type cannot be null or empty");
        }

        if (account.getAccountBalance() < 0) {
            throw new IllegalArgumentException("Account balance cannot be negative");
        }

        // Additional business logic can go here

        // Save the account and return it
        return accountRepository.save(account);
    }


	public Account registerAccount(Account account) {
		return accountRepository.save(account);
	}

	public Account getAccountDetails(int accountId) {
		return accountRepository.findById(accountId).get();
	}
	
	public Account registerDummyAccount() {
		Account account = new Account(1010101010,"Shubham","Saving Account",20000.0);
		return account;
	}

}