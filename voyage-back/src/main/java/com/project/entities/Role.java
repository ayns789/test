package com.project.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_role")
public class Role extends AbstractEntityId {
	
	@Column(name="rol_libelle")
	private String libRole;

	@OneToMany(mappedBy="role", cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    private List<Account> account;
	
	public Role() {
		
	}
	

//	@Override
//	public String toString() {
//		return "Role [libRole=" + libRole + "]";
//	}



	public String getLibRole() {
		return libRole;
	}

	public void setLibRole(String libRole) {
		this.libRole = libRole;
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
