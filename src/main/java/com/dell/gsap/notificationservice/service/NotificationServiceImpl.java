package com.dell.gsap.notificationservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dell.gsap.notificationservice.dao.NotificationDAO;
import com.dell.gsap.notificationservice.entity.Notification;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	private NotificationDAO notificationDAO;
	
	private static final Logger logger=LoggerFactory.getLogger(NotificationServiceImpl.class);
	
	public NotificationServiceImpl() {
		
	}
	
	@Override
	public Notification save(Notification notification) {
		try {
		
			return notificationDAO.save(notification);
			
		}catch (Exception e) {
			logger.error("Exception occur while saving Notification",e);
			return null;
		}
	}
}
