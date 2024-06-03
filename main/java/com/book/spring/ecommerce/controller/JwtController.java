package com.book.spring.ecommerce.controller;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
	
	

	    org.slf4j.Logger logger = LoggerFactory.getLogger(JwtController.class);

	    @RequestMapping("/test")
	    public String test() {
	        this.logger.warn("This is working message");
	        return "Testing message";
	    }

}
	
