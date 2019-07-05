package com.mule.store.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.mule.store.Condition;

public class StoreTransformer extends AbstractMessageTransformer{
	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		String name = message.getInboundProperty("name", "defaultName");
		String age = message.getInboundProperty("age", "0");
		
		String service = message.getInboundProperty("service");
		Condition condition = new Condition();
		condition.setService(service);
		condition.getParams().put("name", name);
		condition.getParams().put("age", age);
		return condition;
	}

}
