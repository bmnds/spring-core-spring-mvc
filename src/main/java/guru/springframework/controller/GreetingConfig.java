package guru.springframework.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import thirdparty.Greeting;
import thirdparty.GreetingService;

@Configuration
public class GreetingConfig {
	
	@Bean
	@Profile("default")
	public GreetingService greetingService() {
		return new Greeting();
	}

}
