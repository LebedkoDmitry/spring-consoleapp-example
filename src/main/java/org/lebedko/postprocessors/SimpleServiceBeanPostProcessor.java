package org.lebedko.postprocessors;

import org.lebedko.services.SimpleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SimpleServiceBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof SimpleService) {
            System.out.println("postProcessBeforeInitialization on bean of SimpleService");
            return bean;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof SimpleService) {
            System.out.println("postProcessAfterInitialization on bean of SimpleService");
            return bean;
        }
        return bean;
    }
}
