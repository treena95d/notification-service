package com.dell.gsap.notificationservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dell.gsap.notificationservice.entity.Notification;

@Repository
public interface NotificationDAO extends MongoRepository<Notification, String>{
	
}
