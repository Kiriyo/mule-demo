package com.mule.email;

import java.util.Properties;

import javax.mail.URLName;

import org.mule.api.MuleContext;
import org.mule.transport.email.SmtpsConnector;


/**
 * 自定义smtp连接器(smtp connector):
 * @author Administrator
 *
 */
public class SmtpConnector extends SmtpsConnector{

	public SmtpConnector(MuleContext context) {
		super(context);
	}
	
	
	@Override
	protected void extendPropertiesForSession(Properties global,
			Properties local, URLName url) {
		// TODO Auto-generated method stub
		super.extendPropertiesForSession(global, local, url);
		local.setProperty("mail.smtp.starttls.enable", "true");     
        local.setProperty("mail.smtp.auth", "true");     
        local.setProperty("mail.smtps.starttls.enable", "true");     
        local.setProperty("mail.smtps.auth", "true");  
	}

}
