package com.project.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_booking")
public class Booking extends AbstractEntityId {

	
	@Column(nullable = false, name="boo_date")
	private LocalDate dateBooking;
	
	@Column(nullable = false, name="boo_date_start")
	private LocalDate dateStartBooking;
	
	@Column(nullable = false, name="boo_date_end")
	private LocalDate dateEndBooking;
	
	@NotNull
	@Column(name="boo_number_persons")
	private Integer numberPersons;
	
	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false, name="boo_availability")
	private boolean availability;
	
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Account account;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Establishment establishment;
	
	@OneToMany(mappedBy="booking")
	private List<BillDetails> billdetails;

	public Booking () {
		
	}


	public LocalDate getDateBooking() {
		return dateBooking;
	}

	public void setDateBooking(LocalDate dateBooking) {
		this.dateBooking = dateBooking;
	}

	public LocalDate getDateStartBooking() {
		return dateStartBooking;
	}

	public void setDateStartBooking(LocalDate dateStartBooking) {
		this.dateStartBooking = dateStartBooking;
	}

	public LocalDate getDateEndBooking() {
		return dateEndBooking;
	}

	public void setDateEndBooking(LocalDate dateEndBooking) {
		this.dateEndBooking = dateEndBooking;
	}

	public int getNumberPersons() {
		return numberPersons;
	}

	public void setNumberPersons(int numberPersons) {
		this.numberPersons = numberPersons;
	}


	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public List<BillDetails> getBilldetails() {
		return billdetails;
	}


	public void setBilldetails(List<BillDetails> billdetails) {
		this.billdetails = billdetails;
	}


	public void setNumberPersons(Integer numberPersons) {
		this.numberPersons = numberPersons;
	}


}
