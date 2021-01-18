package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
        
        System.out.println("============================");
        Performer p1=(Performer)springContainer.getBean("Vishal");
        p1.perform();
        
        System.out.println("============================");
        Performer p2=(Performer)springContainer.getBean("Komal");
        p2.perform();
        
        System.out.println("============================");
        Performer p3=(Performer)springContainer.getBean("Amit");
        p3.perform();
        
        System.out.println("============================");
        Performer p4=(Performer)springContainer.getBean("Divya");
        p4.perform();
        
        
    }
}
