package com.sigma.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(ApiApplication.class, args);

        Car car=context.getBean(Car.class);
        car.startCar();

        Sim sim=new Airtel();
        sim.calling();
        sim.data();
    }

}
