package guru.springframework.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import thirdparty.Greeting;

@Configuration
public class GreetingConfig {
	
	@Bean
	public Greeting greeting() {
		return new Greeting();
	}

}
