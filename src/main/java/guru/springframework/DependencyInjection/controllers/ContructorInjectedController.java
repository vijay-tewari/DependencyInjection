package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private final GreetingService greetingService;


    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
