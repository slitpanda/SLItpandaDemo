package com.itpanda.tution;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//test
@SpringBootApplication
@EnableOAuth2Sso
@Controller

public class OnlineTutionApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(OnlineTutionApplication.class, args);
	}
}
