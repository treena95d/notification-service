package com.dell.gsap.notificationservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dell.gsap.notificationservice.NotificationServiceApplication;
/*
@Component
@Service
public class NotificationListener {

	private static final Logger log =LoggerFactory.getLogger(NotificationListener.class);
	
	@RabbitListener(queues = NotificationServiceApplication.DEFAULT_PARSING_QUEUE)
	public void consumeDefaultMessage(final Message message) {
		log.info("Received Message with Default Config: {}", message.toString());
	}
	
}
*/
