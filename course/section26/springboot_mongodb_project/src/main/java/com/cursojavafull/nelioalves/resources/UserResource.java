package com.cursojavafull.nelioalves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursojavafull.nelioalves.domain.User;
import com.cursojavafull.nelioalves.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)		// Mesmo de @GetMapping
	public  ResponseEntity<List<User>> finAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
