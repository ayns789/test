package com.project.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_civility")
public class Civility extends AbstractEntityId {
	

	
	@NotBlank
	@Column(name="civ_libelle")
	private String libCivility;
	
	@OneToMany(mappedBy="civility", cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    private List<Account> account;
	
	public Civility() {
		
	}

	public String getLibCivility() {
		return libCivility;
	}

	public void setLibCivility(String libCivility) {
		this.libCivility = libCivility;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	

}
