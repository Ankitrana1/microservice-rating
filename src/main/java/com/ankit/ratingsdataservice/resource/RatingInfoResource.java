package com.ankit.ratingsdataservice.resource;

import com.ankit.ratingsdataservice.model.Rating;
import com.ankit.ratingsdataservice.model.UserRating;
import com.ankit.ratingsdataservice.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingInfoResource {

    @Autowired
    IRatingService ratingService;

    @GetMapping(value = "/{movieId}", produces = "application/json")
    public ResponseEntity<Rating> getMovieRating(@PathVariable String movieId){
        return ResponseEntity.ok().body(ratingService.getMovieRating(movieId));
    }

    @GetMapping(value = "/user/{userId}", produces = "application/json")
    public ResponseEntity<UserRating> getAllMoviesForUser(@PathVariable String userId){
        return ResponseEntity.ok().body(ratingService.getAllMoviesRating(userId));
    }
}
