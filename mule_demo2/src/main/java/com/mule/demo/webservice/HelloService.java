package com.mule.demo.webservice;

import javax.jws.WebService;


//@WebService(endpointInterface="com.mule.demo.webservice.HelloService", serviceName="HelloService")
@WebService
public interface HelloService {
	
	
	String sayHi(Object message);
	
	
}
