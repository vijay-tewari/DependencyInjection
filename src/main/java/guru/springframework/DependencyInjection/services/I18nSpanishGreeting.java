package guru.springframework.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreeting implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from I18nSpanishGreeting";
    }
}
