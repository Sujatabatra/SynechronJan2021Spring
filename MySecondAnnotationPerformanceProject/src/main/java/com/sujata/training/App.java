package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
     
        
        Performer p1=(Performer)springContainer.getBean("Vishal");
        p1.perform();
        
        
    }
}
