package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

//IOC : Inversion of control : Seperating the depedency logic from the business logic of your application for making ur system loosely coupled
//To Achive IOC : we make use of depedency injection 
public class App 
{
    public static void main( String[] args )
    {
    	
    	//Life Cycle : constructor -> setter -> setBeanName(BeanNameAware) -> afterPropertySet(InitializingBean) -> custom init method
        AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
     
        springContainer.registerShutdownHook();
        
        System.out.println("============================");
        
        Performer p1=(Performer)springContainer.getBean("Vishal");
        p1.perform();
        
        System.out.println("=========================");
        
        //for container shutdown : destroy(DisposableBean) -> custom destroy
    }
}
