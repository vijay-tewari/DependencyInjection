package guru.springframework.DependencyInjection.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello from ContructorGreetingService";
    }
}
