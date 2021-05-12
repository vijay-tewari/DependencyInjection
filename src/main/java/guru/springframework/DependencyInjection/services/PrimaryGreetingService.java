package guru.springframework.DependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Qualifier takes precedence over Primary and in situation when @Qualifier is not used then @Primary
//takes control
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from PrimaryGreetingService";
    }
}
