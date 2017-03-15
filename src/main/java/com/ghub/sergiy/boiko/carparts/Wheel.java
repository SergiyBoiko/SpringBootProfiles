package com.ghub.sergiy.boiko.carparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wheel {

    @Autowired(required = true)
    Tyres tyres;

    public Wheel(){}

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

}
