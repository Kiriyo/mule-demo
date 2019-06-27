package com.mule.demo.webservice.impl;

import javax.jws.WebService;

import com.mule.demo.webservice.HelloService;

@WebService(endpointInterface="com.mule.demo.webservice.HelloService", serviceName="HellService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHi(Object message) {
		return "Say Hello!";
	}

}
