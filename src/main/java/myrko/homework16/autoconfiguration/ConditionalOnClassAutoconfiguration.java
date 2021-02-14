package myrko.homework16.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(myrko.homework16.ConfigurationEnabler.class)
@Configuration
public class ConditionalOnClassAutoconfiguration {

    @Bean
    public void conditionOnClassResponse(){
        System.out.println("Autoconfiguration using condition 'ConditionalOnClass' created");
    }
}
