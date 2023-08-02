package com.cg.details.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.details.Model.User;
import com.cg.details.Service.UserService;

@RestController
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	//http://localhost:8081/home/user
	
	@GetMapping(value="/user")
	public List<User> getUser() {
		System.out.println("getting users:");
		return this.userService.getUser();
	}
	
	@GetMapping(value="/get")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
