package com.ecommerce.server.service;

import javax.mail.MessagingException;

public interface EmailService {

	public void sendSimpleMessage(String to,String sub,String msg) throws MessagingException;
	
}
