package com.example.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.entity.User;
import com.example.login.repository.UserRepository;

@Service
public class UserServiceRepo {
	
	
	@Autowired
	UserRepository repo;
	
	
	
	public boolean validUser(String email, String passwrod) {
		
		List<User> listofuser= repo.findAll();
		
		
		for (User user : listofuser) {
			
			if(user.getEmail().equals(email) || user.getPassword().equals(passwrod)) {
				return true;
			}
			
		}
		
		
		return false;
	}
	

}
