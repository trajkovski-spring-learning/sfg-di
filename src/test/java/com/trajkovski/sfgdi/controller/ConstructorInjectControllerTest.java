package com.trajkovski.sfgdi.controller;

import com.trajkovski.sfgdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new GreetingServiceImpl());
    }


    @Test
    void getGreeting() {
        assertEquals("Hello World", controller.getGreeting());
    }
}