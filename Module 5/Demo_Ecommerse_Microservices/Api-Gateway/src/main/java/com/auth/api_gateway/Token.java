package com.auth.api_gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Token {

	  @Value("${jwt.token}")
	    private String jwtToken;

	    @PostMapping("/token")
	    public void receiveToken(@RequestBody String token) {
	        // Store the received token securely, e.g., in memory, encrypted storage, or database
	        jwtToken = token;
	    }
}
