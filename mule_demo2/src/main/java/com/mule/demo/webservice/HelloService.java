package com.mule.demo.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;


//@WebService(endpointInterface="com.mule.demo.webservice.HelloService", serviceName="HelloService")
@WebService(targetNamespace="helloMule")
public interface HelloService {
	
	
//	String sayHi(@WebParam(name="param")Object param, @WebParam(name="message") Object message);
	
	String sayHi(@WebParam(name="message") Object message);
	
	
}
