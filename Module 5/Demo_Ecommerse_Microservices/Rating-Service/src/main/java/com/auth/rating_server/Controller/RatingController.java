package com.auth.rating_server.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.rating_server.Entity.Rating;
import com.auth.rating_server.Entity.RatingRequest;
import com.auth.rating_server.Exception.ProductException;
import com.auth.rating_server.Exception.UserException;
import com.auth.rating_server.Service.RatingService;
import com.auth.rating_server.dto.UserAuth;
import com.auth.rating_server.feign_client.UserService;

@RestController
@RequestMapping("api/ratings")
public class RatingController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private RatingService ratingService;

	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody RatingRequest req,
			@RequestHeader("Authorization") String jwt)throws UserException,ProductException{
//		User user= userService.findUserProfileByJwt(jwt); // this is the monolithic formate
		
		UserAuth user = userService.findUserProfileByJwt(jwt);// this is the feign client formate
		Rating rating =  ratingService.createRating(req, user);
		return new ResponseEntity<Rating>(rating,HttpStatus.CREATED);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<List<Rating>> getProductRating(@PathVariable Long productId,
			@RequestHeader("Authorization")String jwt)throws UserException,ProductException{
		UserAuth user = userService.findUserProfileByJwt(jwt);
		
		List<Rating> ratings = ratingService.getProductsRating(productId);
		return new ResponseEntity<List<Rating>>(ratings,HttpStatus.OK);
	}}
	