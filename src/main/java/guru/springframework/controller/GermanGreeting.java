package guru.springframework.controller;

import org.springframework.stereotype.Component;

import thirdparty.GreetingService;

/**
 * This class represents an extension from a third-party library injected by a Config class.
 * @author Bruno
 *
 */
@Component
public class GermanGreeting implements GreetingService {
	
	@Override
	public String sayHello() {
		return "Hallo, Dritte Seite";
	}
	
}