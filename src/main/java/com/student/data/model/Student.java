package com.student.data.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@Embedded
	Address address;
	
	@OneToOne(mappedBy = "Student")
	Hostel hostel;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	List<Book> bookList = new ArrayList<>();
	
	@ManyToMany(mappedBy = "studentList",cascade = CascadeType.ALL)
	List<Course> courseList = new ArrayList<>();
	
}
