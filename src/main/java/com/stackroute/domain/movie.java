package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;
    private ApplicationContextAware applicationContextAware;
    private  BeanFactoryAware beanFactoryAware;
    private  BeanNameAware beanNameAware;

    public com.stackroute.domain.Actor getActor() {
        return actor;
    }

    public movie(com.stackroute.domain.Actor actor) {
        this.actor = actor;
    }

    public void setActor(com.stackroute.domain.Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}