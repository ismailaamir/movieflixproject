package com.aamir.api.controller;
import com.aamir.api.entity.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="ratings")
public class RatingController {
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Rating> findAll() {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.GET, value = "{id}")
	public Rating findOne(@PathVariable("id") String ratingId) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.GET, value="avg/{id}")
	public double findAvg(@PathVariable("id") String movieId) {
		return 0;
		
	}
	@RequestMapping(method= RequestMethod.POST)
	public Rating create(@RequestBody Rating rating) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.PUT, value = "{id}")
	public Rating update(@PathVariable("id") String ratingId, @RequestBody Rating rating) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String ratingId) {
		
	}
}
