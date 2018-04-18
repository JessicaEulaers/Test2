package edu.ap.spring.beans;

import org.springframework.stereotype.Component;
 
@Component("helloWorldBean")
public class HelloWorldBean {
	
	private String name = "Bean"; 
	
	public HelloWorldBean() {}
	
	public HelloWorldBean(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello " + name;
	}
}
