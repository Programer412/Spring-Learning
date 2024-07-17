package com.gaurav.Spring_Demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws BeansException
    {ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
      gaurav obj=(gaurav)factory.getBean("gaurav");
      
      
    }
}
