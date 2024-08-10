package com.pagination.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pagination.entity.Student;

@Repository
public interface PaginationRepository extends JpaRepository<Student, UUID> {


	
}
