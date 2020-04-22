package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import guru.springframework.service.HelloWorldService;
import thirdparty.GreetingService;

@Component
public class GreetingController {
	
	@Autowired
	private HelloWorldService service;
	
	/**
	 * When autowiring without a qualifier, a bean will get injected by profile.
	 */
	@Autowired
	private GreetingService greeting;
	
	/**
	 * Otherwise, it will use the qualifier to search for a bean with that name.
	 */
	@Autowired
	@Qualifier("germanGreeting")
	private GreetingService germanGreeting;
	
	public String sayInjectedHello(String to) {
		return service.sayHello(to);
	}
	
	public String sayThirdPartyHello() {
		return greeting.sayHello();
	}
	
	public String sayHelloInGerman() {
		return germanGreeting.sayHello();
	}
	
}
