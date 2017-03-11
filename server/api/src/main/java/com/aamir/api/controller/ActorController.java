package com.aamir.api.controller;
import com.aamir.api.entity.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userroles")
public class ActorController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserRole> findAll() {
		return null;
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public UserRole findOne(@PathVariable("id") String roleId) {
		
		return null;
	}
	@RequestMapping(method = RequestMethod.POST)
	public UserRole create(@RequestBody UserRole userrole) {
		
		return null;
	}
	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public UserRole update(@PathVariable("id") String roleId, @RequestBody UserRole userrole) {
		
		return null;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String roleId) {
		
	}
}
