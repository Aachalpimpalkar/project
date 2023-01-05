package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Address implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private int address_id;
	
	@Column(name="ADDRESS_STREET")
	private String Street;
	
	@Column(name="ADDRESS_CITY")
	private String City;
	
	@Column(name="ADDRESS_STATE")
	private String state;
	
	@Column(name="ADDRESS_ZIPCODE")
	private String zipcode;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
