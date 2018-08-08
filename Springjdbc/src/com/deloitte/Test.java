package com.deloitte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		// create object of employee class
//		
//		Employee emp= new Employee(1,"krishna",24);
//		
		//invoke appropriate dao method
	//	    eDao.insertRow(emp);
//	    eDao.deleterow(emp);
//		Employee emp1= new Employee(7, "abc",23);
//		Employee emp2= new Employee(8, "kk",55);
//		ArrayList emplist= new ArrayList();
//		emplist.add(emp1);
//		emplist.add(emp2);
//		eDao.insetMultipleRows(emplist);
//		eDao.updatrow(emp);
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDAO eDao= (EmployeeDAO)context.getBean("eDao");
		List<Employee> allEmployees =eDao.readAllEmployees();
		Iterator<Employee> it=allEmployees.iterator();
		while(it.hasNext())
		{
			Employee e= it.next();
			System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getDepartmentId());
		}

		
		

	}

}
