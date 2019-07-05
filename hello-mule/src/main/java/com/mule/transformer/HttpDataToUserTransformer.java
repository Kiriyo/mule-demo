package com.mule.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.mule.transformer.model.User;

public class HttpDataToUserTransformer extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		String name = message.getInboundProperty("name", "defaultName");
		String age = message.getInboundProperty("age", "0");
		
		
		String method = message.getInboundProperty("method", "0");
		
		System.out.println("method:" + method);
		
		return new User(name, age);
	}

}
