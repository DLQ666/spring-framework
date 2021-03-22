package com.dlq.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *@program: spring
 *@description:
 *@author: Hasee
 *@create: 2021-03-22 21:03
 */
@ComponentScan
@Configuration
public class TestConfig {

	@Bean
	public User user(){
		return new User("007", "哈哈哈哈");
	}
}
