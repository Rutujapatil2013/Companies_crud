package com.Company.entity;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.annotations.ForeignKey;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="company_table")
public class CompanyEntity {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="companyId")
	 private String companyId;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private AddressEntity address;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_companyId",foreignKey=@ForeignKey(name="FK_company_address"));
//	private AddressEntity address;
	
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="isDeleted")
	private Boolean deleteCheck;
	

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
