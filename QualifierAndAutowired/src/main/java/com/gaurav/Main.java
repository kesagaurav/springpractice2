package com.gaurav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

	ApplicationContext context=	new ClassPathXmlApplicationContext("beans.xml");
	Emp e=(Emp)context.getBean("emp1",Emp.class);
	System.out.println(e);
	
	}

}
