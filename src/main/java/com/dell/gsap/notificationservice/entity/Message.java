package com.dell.gsap.notificationservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Message {

	private String body;
	private String subject;
	private String header;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
	
}
