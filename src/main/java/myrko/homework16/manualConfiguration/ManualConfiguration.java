package myrko.homework16.manualConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualConfiguration {
    public ManualConfiguration() {
        System.out.println("Manual configuration created");
    }
}
