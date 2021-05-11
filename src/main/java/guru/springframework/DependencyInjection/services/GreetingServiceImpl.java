package guru.springframework.DependencyInjection.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello from GreetingServiceImpl";
    }
}
