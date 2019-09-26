package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        System.out.println("Config file loaded.");
        actor actor = (actor) factory.getBean("actor");
        movie movie1 = (movie) factory.getBean("movie1");
        System.out.println(movie1.getActor().getName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        movie movie2 = (movie)context.getBean("movie2");
        System.out.println(movie2.getActor().getName());
    }
}
