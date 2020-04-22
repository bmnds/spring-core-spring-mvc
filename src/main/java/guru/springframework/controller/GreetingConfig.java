package guru.springframework.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import thirdparty.Greeting;
import thirdparty.GreetingService;
import thirdparty.GreetingSpanish;

/**
 * Configuration classes should be used to tell Spring how to instantiate a bean from a third-party library.
 * @author Bruno
 *
 */
@Configuration
public class GreetingConfig {
	
	@Bean
	@Profile("default")
	@Primary
	public GreetingService greetingService() {
		return new Greeting();
	}
	
	@Bean(name="spanishGreeting")
	public GreetingService greetingServiceSpanish() {
		return new GreetingSpanish();
	}
	
}
