package com.mule.store;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;


public class WebServiceUtil {
	
	
	/**
	 * 请求webService接口
	 * @param serviceUrl wsdl服务路径
	 * @param operationName 调用的操作名称（方法名称）
	 * @param params 参数列表
	 * @return
	 */
	public static Object call(String serviceUrl, String operationName, Map<String, Object> params){
		Object res = null;
		Object[] paramsArray = new Object[params.size()];
		
		Service service = new Service();
		try {
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(serviceUrl);
			int index = 0;
			for (Entry<String, Object> entry : params.entrySet()) {
				call.addParameter(entry.getKey(), XMLType.XSD_STRING, ParameterMode.IN);
				paramsArray[index] = entry.getValue();
			}
			call.setOperationName(operationName);// 调用的方法名  //当这种调用不到的时候,可以使用下面的,加入命名空间名
//            call.setOperationName(new QName(namespace, operationName));// 调用的方法名
			call.setReturnType(XMLType.XSD_STRING); 
			res = call.invoke(paramsArray);
			System.out.println(res);
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 请求webService接口
	 * @param serviceUrl wsdl服务路径
	 * @param namespace 命令空间
	 * @param operationName 调用的操作名称（方法名称）
	 * @param params 参数列表
	 * @return
	 */
	public static Object call(String serviceUrl, String namespace, String operationName, Map<String, Object> params){
		Object res = null;
	
		Object[] paramsArray = new Object[params.size()];
		
		Service service = new Service();
		try {
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(serviceUrl);
			int index = 0;
			for (Entry<String, Object> entry : params.entrySet()) {
				call.addParameter(entry.getKey(), XMLType.XSD_STRING, ParameterMode.IN);
				paramsArray[index] = entry.getValue();
			}
//			call.setOperationName(operationName);// 调用的方法名  //当这种调用不到的时候,可以使用下面的,加入命名空间名
            call.setOperationName(new QName(namespace, operationName));// 调用的方法名
			call.setReturnType(XMLType.XSD_STRING); 
			res = call.invoke(paramsArray);
			System.out.println(res);
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		String serviceUrl = "http://localhost:8087/services/user?wsdl";
		String operationName = "getUserName";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", "1");
		call(serviceUrl, operationName, params);
	}
	
	
	
	
}
