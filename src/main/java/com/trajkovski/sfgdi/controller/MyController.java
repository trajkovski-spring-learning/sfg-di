package com.trajkovski.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Say hello");

        return "Hello Folks!";
    }
}
