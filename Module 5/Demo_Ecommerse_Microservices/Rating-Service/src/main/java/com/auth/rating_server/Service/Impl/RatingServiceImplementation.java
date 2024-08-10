package com.auth.rating_server.Service.Impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.rating_server.Entity.Rating;
import com.auth.rating_server.Entity.RatingRequest;
import com.auth.rating_server.Exception.ProductException;
import com.auth.rating_server.Repository.RatingRepository;
import com.auth.rating_server.Service.RatingService;
import com.auth.rating_server.dto.Product;
import com.auth.rating_server.dto.UserAuth;
import com.auth.rating_server.feign_client.ProductService;

@Service
public class RatingServiceImplementation implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private ProductService productService;

	
	

	public List<Rating> getProductsRating(Long productId) {
		
		
		return ratingRepository.getAllProductRating(productId) ;
	}

	@Override
	public Rating createRating(RatingRequest req, UserAuth user) throws ProductException {
		
//		Product product = productService.findProductById(req.getProductId()); //  this is  normal form of monolithic 
		
		Product product = productService.findProductByIdHandler(req.getProductId()); // this  is the  feign client method process.
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreateAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
	}
	}


