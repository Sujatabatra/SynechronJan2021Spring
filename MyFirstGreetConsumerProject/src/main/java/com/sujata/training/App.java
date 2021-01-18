package com.sujata.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.Greet;

public class App 
{
    public static void main( String[] args )
    {
        Resource resource=new ClassPathResource("greet.xml");
        BeanFactory springContainer=new XmlBeanFactory(resource);
        
        Greet g1=(Greet)springContainer.getBean("eve");
        g1.wish("Sujata");
        
    }
}
