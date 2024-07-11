package com.vrs.ratingService.services.RatingServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.ratingService.entities.Rating;
import com.vrs.ratingService.repositories.RatingsRepository;
import com.vrs.ratingService.services.RatingService;

@Service
public class RatingsServiceImpl implements RatingService{
	
	@Autowired
	RatingsRepository ratingsRepository;

	@Override
	public Rating saveRating(Rating rating) {
		String uuid = UUID.randomUUID().toString();
		rating.setRatingId(uuid);
		return ratingsRepository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		return ratingsRepository.findAll();
	}


	@Override
	public List<Rating> getByUserId(String userId) {
		return ratingsRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		return ratingsRepository.findByHotelId(hotelId);
	}

}
