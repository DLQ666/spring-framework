package com.dlq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@program: spring
 *@description: 测试类
 *@author: Hasee
 *@create: 2021-03-22 21:08
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		User user = (User) context.getBean("user");
		//ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//User user = (User) xmlApplicationContext.getBean("user1");
		System.out.println(user);
	}
}
