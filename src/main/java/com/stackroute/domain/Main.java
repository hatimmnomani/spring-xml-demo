package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        movie movie=(movie)applicationContext.getBean("movie2");

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        movie movieFirst= (movie)xmlBeanFactory.getBean("movie2");

        System.out.println(movie.getActor().getName());

        movie.setApplicationContext(applicationContext);
        movieFirst.setBeanFactory(xmlBeanFactory);
        movie.setBeanName("beam123");
    }
}