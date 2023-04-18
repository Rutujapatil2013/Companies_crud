package com.Company.service;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.Company.entity.AddressEntity;
import com.Company.response.AddressResponse;


@Component
public interface AddressService {
 
	 public List<AddressResponse> getData();
	 
	 public ResponseEntity<AddressResponse> getAddressById(Long id);
	 
	 public String addAddress( AddressEntity user);
	 
	 public String updateAddress(Long id, AddressEntity user);
	 
	 public String deleteAddress(Long id);
 
}