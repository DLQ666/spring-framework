package com.dlq.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-22 21:16
 */
@RestController
public class HelloController {

	@RequestMapping("static.jpg")
	public String hello() {
		return "aaaa";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUser() {
		System.out.println("GET-张三");
		return "GET-张三";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String saveUser() {
		System.out.println("POST-张三");
		return "POST-张三";
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public String putUser() {
		System.out.println("PUT-张三");
		return "PUT-张三";
	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public String deleteUser() {
		System.out.println("DELETE-张三");
		return "DELETE-张三";
	}
}
