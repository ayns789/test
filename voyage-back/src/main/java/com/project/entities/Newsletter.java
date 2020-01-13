package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_newsletter")
public class Newsletter extends AbstractEntityId {
	
	
	@Column(name="name_subscriber")
	private String nameSubscriber;

	@NotBlank
	@Column(name="email_subscriber")
	private String emailSubscriber;

	
	public Newsletter() {
		
	}


	public String getNameSubscriber() {
		return nameSubscriber;
	}


	public void setNameSubscriber(String nameSubscriber) {
		this.nameSubscriber = nameSubscriber;
	}


	public String getEmailSubscriber() {
		return emailSubscriber;
	}


	public void setEmailSubscriber(String emailSubscriber) {
		this.emailSubscriber = emailSubscriber;
	}



}
