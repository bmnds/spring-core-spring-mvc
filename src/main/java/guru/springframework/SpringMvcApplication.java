package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SpringMvcApplication.class, args);
       
       HelloWorldService helloWorld = ctx.getBean(HelloWorldService.class);
       System.out.println(helloWorld.sayHello("Spring"));
       
       InjectionSample injectionSample = ctx.getBean(InjectionSample.class);
       System.out.println(injectionSample.sayInjectedHello("Dependency Injection"));
    }
}
