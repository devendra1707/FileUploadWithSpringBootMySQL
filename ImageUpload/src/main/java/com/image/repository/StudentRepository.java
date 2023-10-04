package com.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
