package com.student.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hostel_tbl")
public class Hostel {
	
	@Id
	private Integer hostel_id;
	private String name;
	private String type;
	private Integer roomNumber;
	
}
