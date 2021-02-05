package com.itpanda.tution.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itpanda.tution.entities.User;
import com.itpanda.tution.services.MainServices;

@EnableOAuth2Sso
@Controller
public class MainController {

	@Autowired
	MainServices mainServices;

	// @EnableOAuth2Sso annotation use for call oAuth

	@GetMapping("/")
	public String homePage(Principal principal, Model model) {

		// pass data to front end using model
		model.addAttribute("username", principal.getName());

		return "home.html";
	}

	@GetMapping("/allusers")
	public String allUsers(Model model) {
		List<User> userList = new ArrayList<User>();
		userList = mainServices.getAllUsersFromDB();

		// pass data to front end using model

		model.addAttribute("userList", userList);

		return "allusers.html";
	}
}
