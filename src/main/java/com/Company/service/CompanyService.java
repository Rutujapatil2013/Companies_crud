package com.Company.service;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.Company.entity.CompanyEntity;
import com.Company.request.CompanyRequest;
import com.Company.response.CompanyResponse;


@Component
public interface CompanyService {
 
	 public List<CompanyResponse> getData();
	 
	 public CompanyResponse getCompanyById(BigInteger id);
	 
	 public CompanyResponse addCompany(CompanyRequest companyRequest);
	 
	 public CompanyResponse updateCompany(CompanyRequest companyRequest,Long id);
	 
	 public String deleteCompany(Long id);
 
}