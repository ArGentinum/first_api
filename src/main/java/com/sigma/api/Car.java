package com.sigma.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
   @Autowired
    Engine engine;
   Brakes brakes;

   Car(Brakes brakes){
       this.brakes=brakes;
   }

   public void start(){
       engine.startEngine();
       System.out.println("vrrooom vroooooom!!");
       brakes.applyBrakes();
   }
}
