package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result =  (theCoach == alphaCoach);
		
		System.out.println("result " + result);
		
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		context.close();
	}
}
