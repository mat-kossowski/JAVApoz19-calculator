package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PercentOperationConfiguration {

    @Bean
    PercentOperation percentOperation(){return new PercentOperation();}
}
