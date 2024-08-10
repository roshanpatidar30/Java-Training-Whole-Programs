package com.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
