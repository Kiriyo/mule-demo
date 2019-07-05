package com.mule.service.impl;

import com.studydemo.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String str) {
		return "Hello" + str;
	}

}
