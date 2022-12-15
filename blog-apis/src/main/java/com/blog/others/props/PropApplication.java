package com.blog.others.props;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:apps.properties")
public class PropApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PropApplication.class, args);
		ReadProps props = applicationContext.getBean(ReadProps.class);
		System.out.println(props.returnURL());
	}
	
	
	
	
}
