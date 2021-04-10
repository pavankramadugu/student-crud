package com.cogoport.task.usercrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class UserCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCrudApplication.class, args);
	}

}
