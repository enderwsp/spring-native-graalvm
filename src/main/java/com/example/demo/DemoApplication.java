package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(DemoApplication.class)
                .initializers((GenericApplicationContext genericApplicationContext) -> genericApplicationContext.setAllowBeanDefinitionOverriding(false)).run(args);
    }

}
