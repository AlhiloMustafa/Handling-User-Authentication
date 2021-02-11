package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.login.entity.User;
import com.example.login.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	private UserRepository userRepository;
	

	@GetMapping(value = "")
	public String dashboardPage() {

		return "index";

	}

	@GetMapping(value = "/register")
	public String register(Model model) {
		model.addAttribute("user", new User());

		return "register";

	}

	@PostMapping("/post_register")
	public String postRegisteration(User user) {
		
		userRepository.save(user);

		return "register_success";

	}
	
	@GetMapping(value = "/login")
	public String getlogin() {
		
		return "login";
	}
	
	
	@PostMapping("/post_login")
	public String postLogin(@RequestParam("email") String logEmail, @RequestParam ("password") String logPassword , Model themodel) {
		
		System.out.println("enterd email :"+ logEmail);
		System.out.println("entered pass: "+ logPassword);
		
		
		
		
		return "register_success";
	}
	
	
	

}
