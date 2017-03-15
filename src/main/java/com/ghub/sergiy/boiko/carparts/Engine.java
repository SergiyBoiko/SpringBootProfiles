package com.ghub.sergiy.boiko.carparts;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "car.engine")
public class Engine {

    private BigDecimal engineСapacity;

    public BigDecimal getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(BigDecimal engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

}
