package com.student.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student {
	
	@Id
	private Integer student_id;
	
	private String student_name;
	
	private int age;
	private String phoneNumber;
	private String branch;
	private String department;
	
	
}
