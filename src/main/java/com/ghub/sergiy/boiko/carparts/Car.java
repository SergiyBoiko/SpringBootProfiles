package com.ghub.sergiy.boiko.carparts;

import com.ghub.sergiy.boiko.carparts.Engine;
import com.ghub.sergiy.boiko.carparts.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Wheel wheels;
    @Autowired
    private Engine engine;

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nwheels tyre size = " + getWheels().getTyres().getSize() +
                "\nwheels tyre name = " + getWheels().getTyres().getName() +
                "\nengine car = " + getEngine().getEngineСapacity() +
                '}';
    }
}
