package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {

    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}