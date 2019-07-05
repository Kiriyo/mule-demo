package com.studydemo.common;

import java.util.Map;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class ParamToXml {
		public static String getParameterForWS(String method,String nameSpace,Map<String, String> map){
				StringBuffer returnBak=new StringBuffer();
				String body=getBodyString(map,method,nameSpace);
				returnBak.append(body);
				return returnBak.toString();
			}
	
	
		private static String getBodyString(Map<String, String> map,String method,String nameSpace) {
			if(map!=null){
				JSONObject json = JSONObject.fromObject(map);
				XMLSerializer ser= new XMLSerializer();
				ser.setRootName("tem:"+method);
						ser.write(json);
						ser.setNamespace("tem", nameSpace);
						ser.setTypeHintsEnabled(false);
				return ser.write(json,"UTF-8");
				
			}else{
				
				return null;
			}
	
		}

}
