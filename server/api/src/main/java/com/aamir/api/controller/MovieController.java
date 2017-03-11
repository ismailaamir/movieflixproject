package com.aamir.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aamir.api.entity.*;

@RestController
public class MovieController {

	@RequestMapping(method = RequestMethod.GET, value = "movies")
	public List<Movie> findAll() {
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
	public Movie findOne(@PathVariable("id") String movieId) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/find/toprated/{type}")
	public List<Movie> findByTopRated(@PathVariable("type") String type) {

		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/find/filter/{TYG}/{searchtext}")
	public List<Movie> findByTYG(@PathVariable("TYG") String TYG, @PathVariable("searchtext") String searchtext) {

		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/find/{searchtext}")
	public List<Movie> findByTitle(@PathVariable("searchtext") String searchtext) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/sort/{searchtext}")
	public List<Movie> sortByImdb(@PathVariable("searchtext") String searchtext) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "movies/find/{imdbId}")
	public Movie findByImdbId(@PathVariable("imdbId") String imdbId) {
		return null;

	}

	@RequestMapping(method = RequestMethod.POST, value = "admin")
	public Movie create(@RequestBody Movie mov) {
		return null;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "admin/{id}")
	public Movie update(@PathVariable("id") String movieId, @RequestBody Movie mov) {
		return null;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "admin/id")
	public void delete(@PathVariable("id") String movieId) {

	}

}
