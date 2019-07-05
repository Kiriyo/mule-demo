package com.mule.demo.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mule.demo.webservice.HelloService;

@WebService
public class HelloServiceImpl implements HelloService{

//	@Override
//	@WebMethod
//	public String sayHi(Object param, Object message) {
//		return "Say Hello!" + param;
//	}
	
	
	@Override
//	@WebMethod
	public String sayHi(Object message) {
		return "Say Hello!" + message;
	}
	
	
}
