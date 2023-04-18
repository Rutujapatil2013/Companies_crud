package com.Company.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registration_table")
public class RegistrationEntity {
	
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="LegalName")
	String legalName;
	
	@Column(name="RegistrationId")
	String registrationId;
	
	@Column(name="D_O_R")
	String date;


	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="companyId")
	 String companyId;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}