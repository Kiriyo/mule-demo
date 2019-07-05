package com.mule.store.runable;

import java.util.Map;

/**
 * 其他出库
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
		//执行数据库查询以及转换等并调用对应的WebService
		
	}

}
