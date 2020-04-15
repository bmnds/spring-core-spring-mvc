package guru.springframework;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!portuguese")
public class HelloWorld implements HelloWorldService {
	
	public String sayHello(String to) { 
		return "Hello, " + to;
	}

}
