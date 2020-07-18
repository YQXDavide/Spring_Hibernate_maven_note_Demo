package com.yang.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.service.CustomerService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		CustomerService service = (CustomerService)context.getBean("customerService");
		service.saveCust();
	}
}
