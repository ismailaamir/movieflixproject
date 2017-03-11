package com.aamir.api.controller;
import com.aamir.api.entity.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "comments")
public class CommentController {
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Comment> findAll() {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.GET, value="movie/{id}")
	public List<Comment> findAllCommentsonMovie(@PathVariable("id") String movieId){
		
		return null;
	}
	@RequestMapping(method= RequestMethod.GET, value="{id}")
	public Comment findOne(@PathVariable("id") String commentId) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.POST)
	public Comment create(@RequestBody Comment comment) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.PUT, value={"id"})
	public Comment update(@PathVariable("id") String commentId, @RequestBody Comment comment) {
		
		return null;
	}
	@RequestMapping(method= RequestMethod.DELETE, value = {"id"})
	public void delete(@PathVariable("id") String commentId) {
		

	}

}
