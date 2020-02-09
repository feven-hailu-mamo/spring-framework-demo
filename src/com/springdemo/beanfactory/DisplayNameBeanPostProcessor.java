package com.springdemo.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Called postProcessBeforeInitialization() for :" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Called postProcessAfterInitialization() for :" + beanName);
        return bean;
    }
}
