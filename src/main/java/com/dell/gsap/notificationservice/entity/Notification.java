package com.dell.gsap.notificationservice.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notification")
public class Notification implements Serializable{

	private Integer notificationId;
	private String sender;
	private String receiver;
	private String channel;
	private Message message;
	
	
	public Notification(String str, int i, boolean b) {
	}
	public Integer getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", sender=" + sender + ", receiver=" + receiver
				+ ", channel=" + channel + ", message=" + message + "]";
	}
	
	
	
	
}

