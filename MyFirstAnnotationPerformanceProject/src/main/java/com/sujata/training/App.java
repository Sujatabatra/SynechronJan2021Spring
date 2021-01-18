package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
        
        Performer p1=(Performer)springContainer.getBean("Amit");
        p1.perform();
    }
}
