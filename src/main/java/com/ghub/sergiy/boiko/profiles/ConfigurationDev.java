package com.ghub.sergiy.boiko.profiles;

import com.ghub.sergiy.boiko.carparts.Engine;
import com.ghub.sergiy.boiko.carparts.Tyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configuratinDev")
public class ConfigurationDev {

    @Bean
    Engine engine(){
        return new Engine();
    }

    @Bean
    Tyres tyres(){
        return new Tyres();
    }
}
