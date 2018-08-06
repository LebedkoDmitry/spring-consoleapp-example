package com.tsystems.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ApplicationContextRefreshedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(String.format("Context refreshed %s", event));
        for (String s : event.getApplicationContext().getBeanDefinitionNames()) {
            System.out.println(String.format("Bean definition is: %s", s));
        }
    }
}