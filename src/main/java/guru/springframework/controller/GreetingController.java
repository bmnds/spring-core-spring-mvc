package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import guru.springframework.service.HelloWorldService;
import thirdparty.Greeting;

@Component
public class GreetingController {
	
	@Autowired
	private HelloWorldService service;
	
	@Autowired
	private Greeting greeting;
	
	public String sayInjectedHello(String to) {
		return service.sayHello(to);
	}
	
	public String sayThirdPartyHello() {
		return greeting.sayHello();
	}

}
