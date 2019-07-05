package com.mule.store.service;

import com.mule.store.BaseService;
import com.mule.store.Condition;

public class StoreService implements BaseService{
	
	@Override
	public String process(Condition condition){
		String service = condition.getService();
		System.out.println("service:" + service);
		
		String xml = "";
		
		if ("savePurchaseIn".equals(service)) {
			xml = this.savePurchaseIn();
		} else if("saveGeneralIn".equals(service)){
			xml = this.saveGeneralIn();
		}else if("saveGeneralOut".equals(service)){
			xml = this.saveGeneralOut();
		}else{
			xml = "UnknownService";
		}
		return xml;
		
	}
	
	
	
	/**
	 * �ɹ���ⵥ
	 * @return
	 */
	public String savePurchaseIn(){
		return "savePurchaseIn.xml";
	}
	
	/**
	 * ������ⵥ
	 * @return
	 */
	public String saveGeneralIn(){
		return "saveGeneralIn.xml";
	}
	
	/**
	 * �������ⵥ
	 * @return
	 */
	public String saveGeneralOut(){
		return "saveGeneralOut.xml";
	}
	
}
