package com.customlogwriter.springbootstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring boot starter class
 * 
 * @author Manoj Nanjundaswamy
 * @since 07-04-2021
 */
@SpringBootApplication
@ComponentScan("com.customlogwriter.*")
@EntityScan("com.customlogwriter.*")
public class SpringBootStarterApplication extends SpringBootServletInitializer {
	/**
	 * Starts the Spring ApplicationContext
	 * @param args accepts command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}
}
