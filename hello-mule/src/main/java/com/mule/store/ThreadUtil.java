package com.mule.store;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * �̳߳ع���
 * @author Administrator
 *
 */
public class ThreadUtil{
	
	
	private static ExecutorService  executorService;
	
	static{
		executorService = Executors.newSingleThreadExecutor();
	}
	
	
	/**
	 * �����߳�
	 * @param runable
	 */
	public static void execute(Runnable runable){
		executorService.execute(runable);
	}
	
	
}
