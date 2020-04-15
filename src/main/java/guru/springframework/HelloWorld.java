package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements HelloWorldService {
	
	public String sayHello(String to) { 
		return "Hello, " + to;
	}

}
