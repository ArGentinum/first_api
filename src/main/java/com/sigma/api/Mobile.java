package com.sigma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Autowired
    @Qualifier("airtelbean")
    Sim sim;



    public void useSim(){
        sim.calling();
        sim.data();
    }
}
