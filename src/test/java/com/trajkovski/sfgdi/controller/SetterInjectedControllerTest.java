package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.ConstructorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorServiceImpl());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World", controller.getGreeting());
    }
}