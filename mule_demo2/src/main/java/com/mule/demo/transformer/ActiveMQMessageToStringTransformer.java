package com.mule.demo.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transport.jms.transformers.AbstractJmsTransformer;

public class ActiveMQMessageToStringTransformer extends AbstractJmsTransformer{

	@Override
	protected void declareInputOutputClasses() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		return message.getPayload();
	}

}
