package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {

    private final GreetingService greetingService;

    public ConstructorInjectController(@Qualifier("constructorServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
