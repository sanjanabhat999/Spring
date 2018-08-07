package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		 Welcome ww = (Welcome) context.getBean("w1");
	      System.out.println(ww.getMsg());

	}

}
