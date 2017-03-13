package com.xlinyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

	@GetMapping(value = "/signin")
	public String signin(ModelMap map){
		map.put("title", "登录");
		return "account/signin";
	}
	
	@PostMapping("/login")
	public String login(){
		return "redirect:dashboard/";
	}
	
	@GetMapping("/logout")
	public String logout(){
		return "redirect:/account/signin";
	}
}
