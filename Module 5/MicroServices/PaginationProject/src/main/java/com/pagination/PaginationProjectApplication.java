package com.pagination;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pagination.entity.Student;
import com.pagination.repository.PaginationRepository;

@SpringBootApplication
public class PaginationProjectApplication  implements CommandLineRunner{
	@Autowired
	private PaginationRepository paginationRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaginationProjectApplication.class, args);
	}
	public void run(String... args)throws Exception {
		
		List<Student> students =new ArrayList<>();
		students.add(Student.builder().name("Roshan").city("India").build());
		students.add(Student.builder().name("Abhi").city("UK").build());
		students.add(Student.builder().name("Harshit").city("US").build());
		students.add(Student.builder().name("Jigyasa").city("Canada").build());
		students.add(Student.builder().name("Swapnil").city("Russia").build());
		students.add(Student.builder().name("Neloy").city("UK").build());
		students.add(Student.builder().name("Hari").city("India").build());
		students.add(Student.builder().name("Sohel").city("India").build());
		students.add(Student.builder().name("Raja").city("India").build());
		students.add(Student.builder().name("Pari").city("India").build());
		students.add(Student.builder().name("Raghav").city("India").build());
		students.add(Student.builder().name("Umesh").city("India").build());
		students.add(Student.builder().name("Rohan").city("India").build());
		students.add(Student.builder().name("Harsh").city("India").build());
		students.add(Student.builder().name("Govinda").city("India").build());
		students.add(Student.builder().name("Halpa").city("India").build());
		students.add(Student.builder().name("Annu").city("India").build());
		students.add(Student.builder().name("Annanya").city("India").build());
		students.add(Student.builder().name("Harshdeep").city("India").build());
		students.add(Student.builder().name("HetSir").city("India").build());
		students.add(Student.builder().name("Shrikant").city("India").build());
		students.add(Student.builder().name("Om").city("India").build());
		students.add(Student.builder().name("Yash").city("India").build());
		students.add(Student.builder().name("Rishubh").city("India").build());
		students.add(Student.builder().name("Amir").city("India").build());
		students.add(Student.builder().name("Faisu").city("India").build());
		students.add(Student.builder().name("Jay").city("India").build());
	 paginationRepository.saveAll(students);
	}

}
