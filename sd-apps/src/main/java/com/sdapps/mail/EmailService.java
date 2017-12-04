package com.sdapps.mail;

import javax.mail.MessagingException;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
	
	public void sendSimpleMessage(String to, String subject, String text);
	
	public void sendSimpleMessageWithAttachment(String to, String subject, String text, MultipartFile file, String fileName)
			throws MessagingException;

}