package com.cg.details.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cg.details.Model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString(),"Yogeesh","yogi@Gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Swamy","swamy@Gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Nagesh","nagesh@Gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Hanuman","hanuman@Gmail.com"));
	}
	
	
	public List<User> getUser(){
		return this.store;
	}
	
	
}
