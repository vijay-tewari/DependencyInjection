package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
