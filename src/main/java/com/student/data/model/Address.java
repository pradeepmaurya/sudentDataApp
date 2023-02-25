package com.student.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "addres_tbl")
public class Address {

	@Id
	private Integer address_id;
	private String landmark;
	private String zipCode;
	private String district;
	private String state;
	private String country;
	
}
