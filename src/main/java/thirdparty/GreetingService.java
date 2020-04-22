package thirdparty;

/**
 * Interface from a third-party library to show how Qualifiers can be applied to inject a custom implementation of it using Spring.
 * @author Bruno
 *
 */
public interface GreetingService {
	
	String sayHello();

}
