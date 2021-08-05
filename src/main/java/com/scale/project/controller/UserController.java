package com.scale.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.scale.project.model.User;
import com.scale.project.service.UserService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("users")
	public ResponseEntity<List<User>> getUsers(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "6") Integer per_page, @RequestParam(defaultValue = "id") String sortBy) {
		List<User> list = userService.getUsers(page, per_page, sortBy);

		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
}
