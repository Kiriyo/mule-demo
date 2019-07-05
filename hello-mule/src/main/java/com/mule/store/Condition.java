package com.mule.store;

import java.util.HashMap;
import java.util.Map;

public class Condition {
	
	
	private String service;
	
	Map<String, Object> params = new HashMap<String, Object>();
	
	public Condition() {
		// TODO Auto-generated constructor stub
	}
	

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
}
