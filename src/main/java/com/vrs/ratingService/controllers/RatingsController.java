package com.vrs.ratingService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrs.ratingService.entities.Rating;
import com.vrs.ratingService.services.RatingServiceImpl.RatingsServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

	@Autowired
	RatingsServiceImpl ratingsServiceImpl;

	// creating ratings
	@PostMapping
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingsServiceImpl.saveRating(rating));
	}

	// get all ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings() {

		return ResponseEntity.ok(ratingsServiceImpl.getRatings());
	}

	// get rating by userId
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(ratingsServiceImpl.getByUserId(userId));
	}

	// get rating by hotelId
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(ratingsServiceImpl.getByHotelId(hotelId));
	}

}
