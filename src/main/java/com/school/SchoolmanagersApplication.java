package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class SchoolmanagersApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SchoolmanagersApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("all")
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) { 
	ServletRegistrationBean registration = new ServletRegistrationBean( 
	      dispatcherServlet); 
	  dispatcherServlet.setThrowExceptionIfNoHandlerFound(true); 
	  return registration; 
	}
	
}
