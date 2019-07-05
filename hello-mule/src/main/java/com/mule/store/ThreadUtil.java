package com.mule.store;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 线程池工具
 * @author Administrator
 *
 */
public class ThreadUtil{
	
	
	private static ExecutorService  executorService;
	
	static{
		executorService = Executors.newSingleThreadExecutor();
	}
	
	
	/**
	 * 启动线程
	 * @param runable
	 */
	public static void execute(Runnable runable){
		executorService.execute(runable);
	}
	
	
}
