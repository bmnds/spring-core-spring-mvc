package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionSample {
	
	@Autowired
	private HelloWorldService service;
	
	public String sayInjectedHello(String to) {
		return service.sayHello(to);
	}

}
