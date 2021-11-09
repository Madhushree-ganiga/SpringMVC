package com.wolken.monument.service;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

	public void printHello() {
		System.out.println("Hello service");

	}

}
