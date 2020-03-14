package com.df.springboot.messaging.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.df.springboot.messaging.rabbitmq.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${sample.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}
