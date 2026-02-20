package com.sigma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiApplication {

    @Autowired
    Mobile mobile;

    @Autowired
    Car car;

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(ApiApplication.class, args);

        ApiApplication car1=context.getBean(ApiApplication.class);

        car1.car.start();

        ApiApplication mobile1=context.getBean(ApiApplication.class);

        mobile1.mobile.useSim();

    }

}
