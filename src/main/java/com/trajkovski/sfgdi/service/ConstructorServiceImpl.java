package com.trajkovski.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
