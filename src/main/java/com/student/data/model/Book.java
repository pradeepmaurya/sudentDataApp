package com.student.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_tbl")
public class Book {
	
	@Id
	private Integer book_id;
	private String title;
	private String author;
	private String description;
	private Integer price;
}
