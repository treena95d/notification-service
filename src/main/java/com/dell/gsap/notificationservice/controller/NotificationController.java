package com.dell.gsap.notificationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dell.gsap.notificationservice.dao.NotificationDAO;
import com.dell.gsap.notificationservice.entity.Notification;
import com.dell.gsap.notificationservice.service.NotificationSender;
import com.dell.gsap.notificationservice.service.NotificationService;
import com.dell.gsap.notificationservice.service.NotificationServiceImpl;

@RestController
@RequestMapping("/notification")
public class NotificationController {
		
	@Autowired
	private NotificationService notificationService;
	@Autowired
	private NotificationSender sender;
	
	private static Logger logger=LoggerFactory.getLogger(NotificationController.class);
	
	@PostMapping( value = "/save", consumes = "application/json", produces = "application/json")
	public void postNotification(@RequestBody Notification notification) {
		notificationService.save(notification);
		sender.sendNotificationMssg(notification);
		
	}
}
