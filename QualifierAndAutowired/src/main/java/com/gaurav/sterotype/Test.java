package com.gaurav.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("sterotype-beans.xml");
		Student s1=(Student)context.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println("_________________");
		System.out.println(s1.getAddress());
	}
}
