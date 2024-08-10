package com.auth.rating_server.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.auth.rating_server.dto.UserAuth;

@FeignClient(name = "AUTH-SERVICE")
public interface UserService {

	@GetMapping("/user")
	public UserAuth findUserProfileByJwt(@RequestHeader("Authorization")String jwt);
	
	
	@GetMapping("/user/{userId}")	
	public UserAuth findUserById(@PathVariable Long userId);
}
