package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

//IOC : Inversion of control : Seperating the depedency logic from the business logic of your application for making ur system loosely coupled
//To Achive IOC : we make use of depedency injection 
public class App 
{
    public static void main( String[] args )
    {
    	//Life cycle of all the beans : constructor -> setter
    	//By default all objected created by spring container are Singleton
    	//By Default all beans are Eagerly loaded
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
        
        System.out.println("============================");
        Performer p1=(Performer)springContainer.getBean("Divya");
        p1.perform();
       
        
        
    }
}
