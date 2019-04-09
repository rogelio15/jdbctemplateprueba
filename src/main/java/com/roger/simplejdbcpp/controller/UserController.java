package com.roger.simplejdbcpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roger.simplejdbcpp.model.User;
import com.roger.simplejdbcpp.repository.UserRepository;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	// test servicio ejecutandose
	@GetMapping
	public String check() {
		return "Bienvenido a la clase de jdbc template";
	}

	/*
	 * 
	 * retorna lista de usuarios
	 * 
	 */
	@GetMapping(path = "/getusernames")
	public List<User> getAllUserNames() {
		
		//String json = new Gson().toJson(userRepository.getAllUserNames() );
		
		return userRepository.getAllUserNames();
	}
}