package com.trajkovski.sfgdi;

import com.trajkovski.sfgdi.controller.ConstructorInjectController;
import com.trajkovski.sfgdi.controller.MyController;
import com.trajkovski.sfgdi.controller.PropertyInjectedController;
import com.trajkovski.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        System.out.println("------------- Primary");
        System.out.println(myController.sayHello());

        System.out.println("------------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------------- Constructor");
        ConstructorInjectController constructorInjectedController = (ConstructorInjectController) context.getBean("constructorInjectController");
        System.out.println(constructorInjectedController.getGreeting());
    }
 }
