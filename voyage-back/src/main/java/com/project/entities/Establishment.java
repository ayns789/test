package com.project.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_establishment")
public class Establishment extends AbstractEntityId {
	

	@NotBlank
	@Column(length=50, name="est_name")
	private String name;
	
	@NotBlank
	@Column(length=800, name="est_descriptive")
	private String descriptive;
	
	@NotNull
	@Column(name="est_capacity")
	private int capacity;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@ManyToMany
	 @JoinTable(
	       name = "t_establishment_category",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "category_id")
	    )
	private List<Category> category;

	@OneToMany
	 @JoinTable(
	       name = "t_establishment_activity",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "activity_id")
	    )
	private List<Activity> activities;
	
	
	@OneToMany(mappedBy="establishment")
	private List<Email> emails;
	
	@OneToMany(mappedBy="establishment")
	private List<Phone> phones;
	
	
	@OneToMany
	 @JoinTable(
	       name = "t_establishment_service",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "service_id")
	    )
	private List<Service> services;
	

	
	public Establishment() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptive() {
		return descriptive;
	}

	public void setDescriptive(String descriptive) {
		this.descriptive = descriptive;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Activity> getActivities() {
		return activities;
	}


	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	public List<Service> getServices() {
		return services;
	}


	public void setServices(List<Service> services) {
		this.services = services;
	}


	public List<Category> getCategory() {
		return category;
	}


	public void setCategory(List<Category> category) {
		this.category = category;
	}


	public List<Email> getEmails() {
		return emails;
	}


	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}


	public List<Phone> getPhones() {
		return phones;
	}


	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
}
