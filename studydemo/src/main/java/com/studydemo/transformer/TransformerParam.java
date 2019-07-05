package com.studydemo.transformer;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.studydemo.bean.User;
import com.studydemo.common.JsonToMapUtil;
import com.studydemo.common.ParamToXml;

import net.sf.json.JSONObject;

public class TransformerParam extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		Map map = null;
		String strxml = null;
		String requestMode = message.getInboundProperty("http.method");
		if("GET".equals(requestMode)) {
			map = message.getInboundProperty("http.query.params");
			strxml = ParamToXml.getParameterForWS("delUser", "http://com.dyj.mavenweb.service/", map);
		} else if("POST".equals(requestMode)) {
			map = (Map) message.getPayload();
			User user = new User();
			String pkId = map.get("pkId").toString();
	    	String id = map.get("id").toString();
			String email = map.get("email").toString();
			String loginName = map.get("loginName").toString();
			String name = map.get("name").toString();
			String password = map.get("password").toString();
			String phone = map.get("phone").toString();
			String status = map.get("status").toString();
			user.setPkId(pkId);
			user.setId(id);
			user.setName(name);
			user.setEmail(email);
			user.setLoginName(loginName);
			user.setPassword(password);
			user.setPhone(phone);
			user.setStatus(status);
			System.out.println("map================"+map);
			JSONObject node = new JSONObject();  
		    node.put("user", user);
		    System.out.println("node==================="+node);
		    Map newMap = JsonToMapUtil.parseJSONToMap(node.toString());
		    System.out.println("newMap==================="+newMap);
		    
			strxml = ParamToXml.getParameterForWS("addUser", "http://com.dyj.mavenweb.service/", newMap);
		}
		
		return strxml;
	}
	
	public static void main(String[] args) {
		//muleContext.getRegistry().registerObject("aa", "bb");
	}

}
