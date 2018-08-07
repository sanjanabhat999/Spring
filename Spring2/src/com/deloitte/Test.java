package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Smartphone s=(Smartphone)context.getBean("smart");
		System.out.println(s.getName());
		System.out.println(s.aa.getType());
		System.out.println(s.getPrice());
		System.out.println(s.aa.getName());
		

	}

}
