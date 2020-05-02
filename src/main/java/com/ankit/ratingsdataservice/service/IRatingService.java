package com.ankit.ratingsdataservice.service;

import com.ankit.ratingsdataservice.model.Rating;
import com.ankit.ratingsdataservice.model.UserRating;

import java.util.List;

public interface IRatingService {

    Rating getMovieRating(String movieId);

    UserRating getAllMoviesRating(String id);
}
