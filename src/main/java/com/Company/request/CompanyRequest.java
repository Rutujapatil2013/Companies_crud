package com.Company.request;

import java.math.BigInteger;

public class CompanyRequest {
	
	BigInteger id;
	String companyId;
	String companyName;
	String phoneNumber;
	Boolean deleteCheck;

	public CompanyRequest(){
		
	}
	
	public BigInteger getId() {
		return id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Boolean getDeleteCheck() {
		return deleteCheck;
	}
	
	
}
