package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
