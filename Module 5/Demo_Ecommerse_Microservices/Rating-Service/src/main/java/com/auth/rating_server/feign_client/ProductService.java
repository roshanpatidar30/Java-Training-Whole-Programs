package com.auth.rating_server.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.auth.rating_server.dto.Product;


@FeignClient(name ="PRODUCT-SERVICE")
public interface ProductService {

	@GetMapping("/products/id/{productId}")
	public Product findProductByIdHandler(@PathVariable Long productId);
}
