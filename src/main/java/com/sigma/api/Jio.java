package com.sigma.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("call from jio!!");
    }

    @Override
    public void data() {
        System.out.println("jio number is:891907549");
    }
}
