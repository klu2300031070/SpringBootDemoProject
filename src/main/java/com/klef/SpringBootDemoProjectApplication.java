package com.klef;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class SpringBootDemoProjectApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		System.out.println("MY Project is runing");
		
	}

}
