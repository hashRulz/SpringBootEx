package com.visitor.visitormanagement_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VisitorManagement2Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VisitorManagement2Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(VisitorManagement2Application.class, args);
	}

}
