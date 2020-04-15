package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SpringmvcApplication.class, args);
       HelloWorldService helloWorld = ctx.getBean(HelloWorldService.class);
       System.out.println(helloWorld.sayHello("Spring"));
    }
}
