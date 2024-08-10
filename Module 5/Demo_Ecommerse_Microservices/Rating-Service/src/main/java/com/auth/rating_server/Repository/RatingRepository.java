package com.auth.rating_server.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.auth.rating_server.Entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

	
	
	@Query("SELECT r From Rating r Where r.product.id=:productId")
	public List<Rating> getAllProductRating(@Param("productId")Long productId);

}
