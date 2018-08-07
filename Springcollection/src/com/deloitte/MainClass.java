package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		CollectionExample ce=(CollectionExample)context.getBean("CollectionExample");
		System.out.println(ce.getCityList());
		System.out.println(ce.getCityMap());
		System.out.println(ce.getCityProp());
		System.out.println(ce.getCitySet());

	}

}
