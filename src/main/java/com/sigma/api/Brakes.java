package com.sigma.api;

import org.springframework.stereotype.Component;

@Component
public class Brakes {
    public void applyBrakes(){
        System.out.println("Sudden brakes applied!!!");
    }
}
