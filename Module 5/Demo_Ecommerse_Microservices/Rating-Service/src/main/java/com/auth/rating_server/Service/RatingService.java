package com.auth.rating_server.Service;

import java.util.List;

import com.auth.rating_server.Entity.Rating;
import com.auth.rating_server.Entity.RatingRequest;
import com.auth.rating_server.Exception.ProductException;
import com.auth.rating_server.dto.UserAuth;

public interface RatingService {

	public Rating createRating(RatingRequest req, UserAuth user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
	
	
	
}
