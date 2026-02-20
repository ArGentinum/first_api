package com.sigma.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("airtelbean")
public class Airtel implements Sim{
    @Override
    public void calling(){
        System.out.println("call from airtel!!");
    }

    @Override
    public void data(){
        System.out.println("airtel number:9059758021");
    }
}
