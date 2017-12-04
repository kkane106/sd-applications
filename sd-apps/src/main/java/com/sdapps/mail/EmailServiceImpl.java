package com.sdapps.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmailServiceImpl implements EmailService {

	private JavaMailSender dispatcher;

	public EmailServiceImpl(JavaMailSender dispatcher) {
		this.dispatcher = dispatcher;
	}

	@Override
	public void sendSimpleMessage(String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);

		dispatcher.send(message);
	}

	@Override
	public void sendSimpleMessageWithAttachment(String to, String subject, String text, MultipartFile file, String fileName) throws MessagingException {
		
		MimeMessage message = dispatcher.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(text);
		helper.addAttachment(fileName, file);
		
		dispatcher.send(message);
	}

}
