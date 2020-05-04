package com.project.banshee.controllers.dtos;

import javax.persistence.Transient;
import javax.validation.constraints.Size;

public class ClientDTO {

	Long id;

	@Size(min = 0, max = 255, message = "The Nit maximum length must be 255 and the minimum length must be 5")
	String nit;

	@Size(min = 0, max = 255, message = "The Full Name maximum length must be 255 and the minimum length must be 5")
	String fullName;
	
	private String address;
	
	@Size(min = 0, max = 20, message = "The Phone maximum length must be 20 and the minimum length must be 5")
	String phone;

	private Long creditLimit;

	private Integer visitsPercentage;

    @Transient
    private Long cityId;

    @Transient
    private Long stateId;

    @Transient
    private Long countryId;
    
	public ClientDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getVisitsPercentage() {
		return visitsPercentage;
	}

	public void setVisitsPercentage(Integer visitsPercentage) {
		this.visitsPercentage = visitsPercentage;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
}
