package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("cycle");
    }
}