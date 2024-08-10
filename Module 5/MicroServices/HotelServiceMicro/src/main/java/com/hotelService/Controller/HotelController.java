package com.hotelService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.hotelService.Entity.Hotel;
import com.hotelService.Service.HotelService;

@RestController

@RequestMapping("/hotels")
public class HotelController {

	
	@Autowired
	private HotelService hotelService;
	
	
	//create 
	@PreAuthorize("hasAuthority('Admin')|| hasAuthority('Normal')") // only admin can create user.
	@PostMapping
	public ResponseEntity<Hotel> createHotel (@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}

	
	
	// get single
	@PreAuthorize("hasAuthority('SCOPE_internal')") //it allows to use only internal user 
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getSingle(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
	}
	// get alll\
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')") // it allows to use only internal user and admin it mean normal user can  not use it.
	@GetMapping
		public ResponseEntity<List<Hotel>> getAll(){
			return ResponseEntity.ok(hotelService.getAll());
		}
}
