package com.vrs.ratingService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrs.ratingService.entities.Rating;

@Repository
public interface RatingsRepository extends JpaRepository<Rating, String> {
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
