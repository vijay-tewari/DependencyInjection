package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.GreetingService;

public class ContructorInjectedController {

    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
