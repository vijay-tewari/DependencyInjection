package guru.springframework.DependencyInjection;

import guru.springframework.DependencyInjection.controllers.ContructorInjectedController;
import guru.springframework.DependencyInjection.controllers.MyController;
import guru.springframework.DependencyInjection.controllers.PropertyInjectedController;
import guru.springframework.DependencyInjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController)  ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println("-------- Primary Bean");
		System.out.println(greeting);

		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("'-------- Setter injected");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("'-------- Constructor injected");
		ContructorInjectedController contructorInjectedController =
				(ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());

	}

}
