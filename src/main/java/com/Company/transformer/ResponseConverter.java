package com.Company.transformer;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.Company.entity.CompanyEntity;
import com.Company.response.CompanyResponse;


@Component
public class ResponseConverter {
	
	public CompanyResponse toCompanyResponse(final CompanyEntity companyEntity) {
		CompanyResponse companyResponse = new CompanyResponse();
		companyResponse.setId(companyEntity.getId());
		companyResponse.setCompanyId(companyEntity.getCompanyId());
		companyResponse.setCompanyName(companyEntity.getCompanyName());
		companyResponse.setPhoneNumber(companyEntity.getPhoneNumber());
		companyResponse.setDeleteCheck(companyEntity.getDeleteCheck());
		return companyResponse;
	}
	
		
	public List<CompanyResponse> convertordata (List<CompanyEntity> userList){
		return userList.stream().map(user ->toCompanyResponse(user)).collect(Collectors.toList());
		
	}
	
	public List<CompanyResponse> toCompanyResponseList (List<CompanyEntity> userList){
		return userList.stream().map(p -> new CompanyResponse(p.getId(),p.getCompanyId(),p.getCompanyName(),p.getPhoneNumber(),p.getDeleteCheck()))
				.collect(Collectors.toList());
		
	}

}
