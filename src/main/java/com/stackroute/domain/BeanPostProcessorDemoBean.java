package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorDemoBean implements BeanPostProcessor, InitializingBean, DisposableBean {

    public static <BeanLifeCycleDemoBean> void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemoBean
                beanLifeCycleDemo = (BeanLifeCycleDemoBean) applicationContext.getBean("lifecycle");

    }

    public void Init ()
    {
        System.out.println("Initialization");
    }

    public  void clean()
    {
        System.out.println("custom destroy");
    }
    public void destroy ()
    {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }

}