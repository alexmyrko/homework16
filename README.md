# homework16
1. Generate Spring Boot application using Spring Initialzr. 
2. Create your own auto-configuration. It should work by the following rules:
    1) Auto-configuration will be enabled if class ConfigurationEnabler is in the classpath;
    2) Auto-configuration has bean than will be created if ‘application.properties’ file contains property “custom.configuration.enabled” with the value true.
3. Provide an executable jar for your application.
