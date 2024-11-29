package com.grp132.SpringAno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    // Bean definition for X
    @Bean
    @Primary // Marks this bean as the preferred one when there are multiple candidates
    public X myx() {
        return new X();  // You can customize the bean creation logic here if needed
    }

    // Another Bean definition for X
    @Bean
    public X mybeanofX() {
        return new X(); // Another instance of X, not the primary one
    }
}
