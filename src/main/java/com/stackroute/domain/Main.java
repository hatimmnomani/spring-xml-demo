package com.stackroute.domain;

import com.stackroute.domain.demo.movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static <BeanLifecycleDemoBean> void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifecycleDemoBean beanLifeCycleDemo = (BeanLifecycleDemoBean) applicationContext.getBean("cycle");
    }
}