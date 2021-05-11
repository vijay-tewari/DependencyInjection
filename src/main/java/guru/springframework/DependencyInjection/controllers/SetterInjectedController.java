package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
