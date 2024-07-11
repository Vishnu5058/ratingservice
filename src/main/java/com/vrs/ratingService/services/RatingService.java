package com.vrs.ratingService.services;

import java.util.List;

import com.vrs.ratingService.entities.Rating;

public interface RatingService {
	

	
	// user operations
	
	// creatting ratings
	Rating saveRating(Rating rating);
	
	
	// get all ratings
	List<Rating> getRatings();
	
	//get all by user id
	List<Rating> getByUserId(String userId);
	
	// get all by hotel id
	List<Rating> getByHotelId(String hotelId);


}
