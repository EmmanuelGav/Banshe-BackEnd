package com.project.banshee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 20)
	private Long id;

	@Column(length = 255, nullable = false)
	private String nit;
	
	@Column(length = 255, nullable = false)
	private String fullName;

	@Column(length = 255)
	private String address;

	@Column(length = 20)
	private String phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
	private City city;

    @Column(length = 20)
    @Value("0")
	private Long creditLimit;
    
    @Column(length = 3)
    @Value("0")
	private Integer visitsPercentage;

    @Transient
    private Long cityId;

    @Transient
    private Long stateId;

    @Transient
    private Long countryId;
    
	public Client() {}

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
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
