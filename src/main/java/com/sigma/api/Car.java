package com.sigma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
    @Autowired
    Engine engine;

    public void startCar(){
        engine.startEngine();
        System.out.print("car is running!!");
    }
}
