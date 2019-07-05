package com.mule.transformer.service;

import com.mule.transformer.model.User;

public class HelloService {
	
	
	public String SayHello(User user){
		return "Hello " + user.getName() + "! Welcome to Mule World! And your age is " + user.getAge() + "!";
	}
	
	
	
	
}
