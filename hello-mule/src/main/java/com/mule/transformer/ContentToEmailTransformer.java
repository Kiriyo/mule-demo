package com.mule.transformer;

import org.mule.RequestContext;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transport.email.MailProperties;

/**
 * �Զ�����Ϣת���������������Ϣת��Ϊemail
 * @author Administrator
 *
 */
public class ContentToEmailTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		String contentStr = (String)src; 
		String[] contents = contentStr.split(",");
		String email = contents[0];
		String content = contents[1];
		
		RequestContext.getEventContext().getMessage().setProperty(MailProperties.TO_ADDRESSES_PROPERTY, email);
		
		return content;
	}

}
