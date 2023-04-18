package com.Company.response;

import java.math.BigInteger;

public class CompanyResponse {

	BigInteger id;
	String companyId;
	String companyName;
	String phoneNumber;
	Boolean deleteCheck;


	public CompanyResponse( BigInteger id, String companyId, String companyName, String phoneNumber, Boolean deleteCheck) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.companyName=companyName;
		this.phoneNumber=phoneNumber;
		this.deleteCheck=deleteCheck;
		
	}

	public CompanyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getId() {
		return id;
	}
	
	public void setId(BigInteger id) {
		this.id = id;
	}
	
	public String getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	} 
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Boolean getDeleteCheck() {
		return deleteCheck;
	}
	
	public void setDeleteCheck(Boolean deleteCheck) {
		this.deleteCheck = deleteCheck;
	}

}
