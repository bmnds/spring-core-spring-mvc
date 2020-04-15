package guru.springframework.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import thirdparty.GreetingService;

@Component
@Profile("portuguese")
public class GreetingInPortuguese implements GreetingService {
	
	@Override
	public String sayHello() {
		return "Olá, Terceiro";
	}

}
