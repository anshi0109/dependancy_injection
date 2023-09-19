package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan
@Configuration
public class DemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);
		System.out.println("radhe");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoApplication.class);
        User u=(User)context.getBean("user");
		System.out.println(u);
		u.app.doubleClick();
		u.app.swipeleft();
	}

}
