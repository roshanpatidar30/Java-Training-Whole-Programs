package com.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.dto.PaginationDTO;
import com.pagination.entity.Student;
import com.pagination.repository.PaginationRepository;

@RestController
@RequestMapping("/student")
public class PaginationController {

	
	@Autowired
	private PaginationRepository paginationRepository;
	
	@PostMapping
	public Page<Student> getAllStudentsUsingPagination(@RequestBody PaginationDTO dto){
		Pageable pageable = new PaginationDTO().getPageable(dto);
		Page<Student> studentPage = paginationRepository.findAll(pageable);
		
				
		return studentPage;
		
	}
}
