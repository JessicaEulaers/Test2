package edu.ap.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.ap.spring.beans.HelloWorldBean;
 
public class HelloApplication {
 	
	
	private HelloWorldBean bean;
	
	@Autowired
	public void setBean(HelloWorldBean bean) {
		this.bean = bean;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		HelloApplication app = new HelloApplication();
		
		// 1. XML Configuration
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//HelloWorldService bean = (HelloWorldBean) context.getBean("helloWorldBean");
		
		// 2. AppConfig Configuration
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//bean = context.getBean("helloWorldBean", HelloWorldBean.class);
		
		// 3. Componentscan / Autowire
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		app.bean = (HelloWorldBean) context.getBean("helloWorldBean");
		
		String message = app.bean.sayHello();
		System.out.println(message);
 
		//set a new name
		app.bean.setName("Spring");
		message = app.bean.sayHello();
		System.out.println(message);
	}
}