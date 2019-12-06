package com.dell.gsap.notificationservice.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dell.gsap.notificationservice.NotificationServiceApplication;
import com.dell.gsap.notificationservice.config.RabbitMQConfig;
import com.dell.gsap.notificationservice.entity.Notification;

@Component
@Service
public class NotificationSender {
	
	private static final Logger log = LoggerFactory.getLogger(NotificationSender.class);
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public NotificationSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	public void sendNotificationMssg(Notification notification) {
		
		rabbitTemplate.convertAndSend("my_queue_exchange", "my.queue.key", notification);
		log.info("Notification Sent");
		System.out.println("Is listener returned ::: "+rabbitTemplate.isReturnListener());
	}
}

 	