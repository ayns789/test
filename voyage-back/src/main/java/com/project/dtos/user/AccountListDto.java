package com.project.dtos.user;

import java.util.List;

public class AccountListDto {
	
	private List<AccountDto> accounts;
	
	public AccountListDto() {
		
	}

	public List<AccountDto> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountDto> accounts) {
		this.accounts = accounts;
	}

}
