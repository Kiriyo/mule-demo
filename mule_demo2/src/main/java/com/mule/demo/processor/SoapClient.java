package com.mule.demo.processor;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class SoapClient implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
		return eventContext;
	}

}
