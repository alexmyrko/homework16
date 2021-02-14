package myrko.homework16.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
@Configuration
public class AutoconfigurationByPropertyValue {

    @Bean
    public void conditionOnPropertyResponse(){
        System.out.println("Autoconfiguration using condition 'ConditionalOnProperty' created");
    }
}
