package com.xlinyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@GetMapping(value = {"", "/"})
	public String index(ModelMap map){
		map.put("title", "Dashboard");
		return "home";
	}

	@GetMapping(value = "/buttons")
	public String buttons(ModelMap map){
		map.put("title", "Buttons");
		return "buttons";
	}
	
	@GetMapping(value = "/form-basic")
	public String form(ModelMap map){
		map.put("title", "Native Form Elements");
		return "form-basic";
	}
	
	
}
