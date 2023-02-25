package com.student.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_tbl")
public class Course {
	
	@Id
	private Integer cource_id;
	private String title;
	private String description;
	private int duration;

}
