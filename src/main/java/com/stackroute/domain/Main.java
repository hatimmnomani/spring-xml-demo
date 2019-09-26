package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        movie movie1 = context.getBean(movie.class);
        System.out.println(movie1.getActor().getName());
        System.out.println(movie1.getActor().getGender());
        System.out.println(movie1.getActor().getAge());



    }
}