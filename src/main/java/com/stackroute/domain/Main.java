package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        movie movieFirst = (movie) factory.getBean("movie1");
        movie movieSecond = (movie) factory.getBean("movie1");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        movie movie1 = (movie)context.getBean("movie2");
        movie movie2 = (movie)context.getBean("movie2");

        movie movieB=(movie)context.getBean("movieB");

        System.out.println(movieFirst.getActor().getName());
        System.out.println(movie2.getActor().getGender());

        System.out.println(movie1==movie2);
        System.out.println(movieFirst==movieSecond);

    }
}