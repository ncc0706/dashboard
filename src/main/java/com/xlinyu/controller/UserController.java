package com.xlinyu.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@GetMapping("/add")
	public User addUser(@RequestParam String username, @RequestParam String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userService.insert(user);
		return user;
	}
	
}
