package com.mule.store.runable;

import java.util.Map;

/**
 * ��������
 * @author Administrator
 *
 */
public class SaveGeneralInRunable implements Runnable{
	
	private Map<String, Object> params;
	
	public SaveGeneralInRunable(Map<String, Object> params) {
		this.params = params;
	}
	
	
	@Override
	public void run() {
		//ִ�����ݿ��ѯ�Լ�ת���Ȳ����ö�Ӧ��WebService
		
	}

}
