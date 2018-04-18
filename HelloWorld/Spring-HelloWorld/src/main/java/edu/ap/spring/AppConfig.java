package edu.ap.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.ap.spring.beans.HelloWorldBean;

@Configuration
@ComponentScan(basePackages = {"edu.ap.spring", "edu.ap.spring.beans"})
public class AppConfig {
	
	/*@Bean(name="helloWorldBean")
	public HelloWorldBean getHelloWorld(){
		return new HelloWorldBean("Bean");
	}*/
}
