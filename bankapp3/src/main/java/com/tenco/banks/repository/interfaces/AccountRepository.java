package com.tenco.banks.repository.interfaces;

import java.util.List;

import com.tenco.banks.repository.model.Account;

public interface AccountRepository {

	public int insert(Account account);
	public int updateById(Account account);
	public int deleteById(int id);
	
	public List<Account> findAll();
	public Account findById(int id);
}
