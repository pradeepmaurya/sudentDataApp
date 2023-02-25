package com.student.data.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.data.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
