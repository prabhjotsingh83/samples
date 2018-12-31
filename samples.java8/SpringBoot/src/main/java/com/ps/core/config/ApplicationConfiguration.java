package com.ps.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Component
@ConfigurationProperties("basic")
public class ApplicationConfiguration {

	    private boolean value;
	    private String message;
	    private int number;

	    //GETTERS AND SETTERS
	    
	    @Profile("dev")
	    @Bean
	    public String devBean() {
	    	return "dev";
	    }

	    @Profile("sit")
	    @Bean
	    public String sitBean() {
	    	return "sit";
	    }
	    
	    @Profile("uat")
	    @Bean
	    public String uatBean() {
	    	return "uat";
	    }

	    @Profile("prod")
	    @Bean
	    public String prodBean() {
	    	return "prod";
	    }

	    
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/home").setViewName("home");
	      
		/*
		 *  registry.addViewController("/").setViewName("home");
		 * registry.addViewController("/hello").setViewName("hello");
		 * registry.addViewController("/login").setViewName("login");
		 */
	    }
	    
	    
}
