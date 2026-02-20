package com.sigma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    Sim sim;

    @Autowired
    Mobile(Sim sim){
        this.sim=sim;
    }

    public void useSim(){
        sim.calling();
        sim.data();
    }
}
