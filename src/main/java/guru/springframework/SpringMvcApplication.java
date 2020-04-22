package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controller.GreetingController;
import guru.springframework.service.HelloWorldService;
import thirdparty.GreetingService;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SpringMvcApplication.class, args);
       
       HelloWorldService helloWorld = ctx.getBean(HelloWorldService.class);
       System.out.println(helloWorld.sayHello("Spring"));
       
       GreetingController greeting = ctx.getBean(GreetingController.class);
       System.out.println(greeting.sayInjectedHello("Dependency Injection"));
       System.out.println(greeting.sayThirdPartyHello());
       System.out.println(greeting.sayHelloInGerman());
       
       GreetingService greetingInSpanish = ctx.getBean("spanishGreeting", GreetingService.class);
       System.out.println(greetingInSpanish.sayHello());
    }
}
