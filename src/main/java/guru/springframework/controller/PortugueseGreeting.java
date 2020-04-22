package guru.springframework.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import thirdparty.GreetingService;

/**
 * This class represents an extension from a third-party library that will be injected depending on the active profile.
 * @author Bruno
 *
 */
@Component
@Profile("portuguese")
@Primary
public class PortugueseGreeting implements GreetingService {
	
	@Override
	public String sayHello() {
		return "Olá, Terceiro";
	}

}
