package com.auth.rating_server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAuth {

	
	private Long id;
	
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String role;
	private String mobile;
	
}

