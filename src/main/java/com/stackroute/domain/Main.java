package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory; //xmlBean Factory has been deprecated must look for other option
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println("Config file loaded.");
        Actor actor = (Actor) factory.getBean("actor");
        Movie movie1 = (Movie) factory.getBean("movie1");
        System.out.println(movie1.getActor().getName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        Movie movie2 = (Movie) context.getBean("movie2");
        System.out.println(movie2.getActor().getName());
        ((AbstractApplicationContext) context).close();
    }
}
