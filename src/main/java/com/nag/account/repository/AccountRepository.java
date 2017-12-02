package com.nag.account.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nag.account.dto.Account;

public interface AccountRepository extends MongoRepository<Account, Long>{
	Account findByacc_name(Account acc_name);
}
	