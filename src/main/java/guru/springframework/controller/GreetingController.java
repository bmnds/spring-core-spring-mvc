package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import guru.springframework.service.HelloWorldService;

@Component
public class GreetingController {
	
	@Autowired
	private HelloWorldService service;
	
	public String sayInjectedHello(String to) {
		return service.sayHello(to);
	}

}
