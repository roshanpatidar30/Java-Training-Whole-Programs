package com.auth.serviceregistry;

import java.time.LocalDateTime;

import org.apache.catalina.realm.JNDIRealm.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String review;
	
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	@JsonIgnore
	private Product product;
	
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private User user;
	
	private LocalDateTime createAt;

}
