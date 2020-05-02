package com.ankit.ratingsdataservice.service.impl;

import com.ankit.ratingsdataservice.model.Rating;
import com.ankit.ratingsdataservice.model.UserRating;
import com.ankit.ratingsdataservice.service.IRatingService;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RatingService implements IRatingService {
    @Override
    public Rating getMovieRating(String movieId) {
        return new Rating("987", "8");
    }

    @Override
    public UserRating getAllMoviesRating(String id) {
        UserRating userRating = new UserRating(Arrays.asList(new Rating("987","8"),
                            new Rating("986", "4")));
        return userRating;
    }
}
