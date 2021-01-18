package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;


public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
        
        System.out.println("=============================");
        Performer p2=(Performer)springContainer.getBean("Divya");
        p2.perform();
        
        
        
    }
}
