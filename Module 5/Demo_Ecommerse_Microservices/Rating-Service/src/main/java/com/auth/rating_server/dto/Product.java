package com.auth.rating_server.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.auth.rating_server.Entity.Rating;

import java.util.Locale.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

	
	private Long id;
	
	private String title;
	
	 private String discription;
	 
	 private int price;
	 
	
	 @Column(name = "discount_price")
	 private int discountPrice;
	 
	 @Column(name ="discount_persent")
	 private int discountPersent;
	 
	 @Column(name = "quantity")
	 private int quantity;
	 
	 @Column(name ="brand")
	 private String brand;
	
	 @Column(name ="color")
	 private String color;
	 
//	 @Embedded
//	 @ElementCollection
//	 @Column(name = "sizes")
	 private Set<Size> sizes = new HashSet<>();
	 	
	 @Column(name = "image_url")
	 private String imageUrl;
	 
	 
//	 @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval = true)
	 private List<Rating> ratings = new ArrayList<>();
//	 
//	 @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval = true)
//	 private List<Review> review = new ArrayList<>();
//	 
	 @Column(name = "num_ratings")
	 private int numRatings;
	 
	 
//	 @ManyToOne
//	 @JoinColumn(name= "catogory_id")
	 private Category category;
	 
	 
	 private LocalDateTime createdAt;
	 
	 
}