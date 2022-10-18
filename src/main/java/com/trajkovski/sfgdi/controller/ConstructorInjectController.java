package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.GreetingService;

public class ConstructorInjectController {

    private final GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
