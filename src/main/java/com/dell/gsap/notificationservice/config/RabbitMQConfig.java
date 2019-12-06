package com.dell.gsap.notificationservice.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:application.properties")
public class RabbitMQConfig {

	@Value("${app1.exchange.name}")
	public String exchange_Name;
	
	@Value("${app1.queue.name}")
	public String default_parsing_queue;
	
	@Value("${app1.routing.key}")
	public String routing_key;
	
//	public static final String ROUTING_KEY = "my.queue.key";
	
	@Bean
	public TopicExchange notifyExchange() { return new TopicExchange(exchange_Name); }
	
	@Bean
	public Queue defaultParsingQueue() { return new Queue(routing_key, true); }
	
	@Bean
	public Binding queueToExchangeBinding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routing_key);
	} 
	
	@Bean
	public MessageConverter jsonMessageConverter() {
			return new Jackson2JsonMessageConverter();
	}
	
}
