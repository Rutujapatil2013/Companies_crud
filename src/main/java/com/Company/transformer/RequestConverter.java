package com.Company.transformer;

import org.springframework.stereotype.Component;

import com.Company.entity.CompanyEntity;
import com.Company.request.CompanyRequest;

@Component
public class RequestConverter {

	public RequestConverter() {
		
	}
	
	public CompanyEntity toUserEntity(final CompanyRequest companyRequest) {
		CompanyEntity companyData = new CompanyEntity();
		companyData.setId(companyRequest.getId());
		companyData.setCompanyId(companyRequest.getCompanyId());
		companyData.setCompanyName(companyRequest.getCompanyName());
		companyData.setPhoneNumber(companyRequest.getPhoneNumber());
		companyData.setDeleteCheck(companyRequest.getDeleteCheck());
		return companyData;
	}

}