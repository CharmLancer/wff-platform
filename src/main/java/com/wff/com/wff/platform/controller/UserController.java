package com.wff.com.wff.platform.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wff.com.wff.platform.model.User;

@RestController
@RequestMapping("user")
public class UserController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public User greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new User(counter.incrementAndGet(), String.format(template, name));
	}
}