package com.auth.rating_server.Entity;

import java.time.LocalDateTime;

import com.auth.rating_server.dto.Product;
import com.auth.rating_server.dto.UserAuth;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name= "user_id",nullable = false)
	private UserAuth user;
	
//	@JsonIgnore
//	@ManyToOne
	@JoinColumn(name = "product_id",nullable = false)
	private Product product;
	
	@Column(name="rating")
	private double rating;
	
	private LocalDateTime createAt;
}



