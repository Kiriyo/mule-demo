package com.mule.demo.processor;


import org.apache.xerces.dom.ElementNSImpl;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;

public class ExtractParamProcessor implements MessageProcessor {

	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
//		try {
//			MuleMessage msg=event.getMessage();
//			Object contents = msg.getPayload();			 
//			System.out.println("PayLoad:" + contents);
//			System.out.println(contents.getClass());
//			
//			
//			ElementNSImpl eleNS = (ElementNSImpl)contents;
//			
//			
//			String value = eleNS.getFirstChild().getTextContent();
//			System.out.println(value);
//			msg.setOutboundProperty("param", value);
//			
////			if (contents.getClass().isArray() && ((Object[])contents).length>0){
////				msg.setOutboundProperty("message", ((Object[])contents)[0]);
////			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("........ExtractActionProcessor.......");
		return event;
	}

}
