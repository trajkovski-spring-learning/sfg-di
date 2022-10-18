package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
