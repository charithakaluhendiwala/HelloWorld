package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HelloWorldApplication;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@EnableScheduling
@RestController
public class AppConfiguration {
	
	static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);
	
	private static int num = 52266;
	

@RequestMapping("/")
public String hello() {
	logger.info("pass");
	return "Hello World";
}
}
