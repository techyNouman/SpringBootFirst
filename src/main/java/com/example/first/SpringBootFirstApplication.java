package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

//		Alien obj = new Alien();
		Alien obj = context.getBean(Alien.class);
//		Alien obj1 = context.getBean(Alien.class);
		obj.code();
//		obj1.code();

	}

}
