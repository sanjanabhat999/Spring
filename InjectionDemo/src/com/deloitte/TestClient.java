package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Computer cc=(Computer) context.getBean("comp");
		System.out.println(cc.getBrandname());
        System.out.println(cc.cpu.getBrandname());
	}

}
