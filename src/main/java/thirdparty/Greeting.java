package thirdparty;

/**
 * Class that simulates a default implementation of an interface inside a third-party library.
 * @author Bruno
 *
 */
public class Greeting implements GreetingService {
	
	public String sayHello() {
		return "Hello, Third Party";
	}

}
