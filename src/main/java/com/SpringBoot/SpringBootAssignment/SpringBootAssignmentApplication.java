package com.SpringBoot.SpringBootAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAssignmentApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(SpringBootAssignmentApplication.class, args);
		User properties=ac.getBean(User.class);
		System.out.println(properties.getId());
		System.out.println(properties.getName());
		System.out.println(properties.getDesignation());
	}

}
