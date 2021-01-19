package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeeUserInterface;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("daojdbc.xml");
        
        EmployeeUserInterface empUserInterface=(EmployeeUserInterface)springContainer.getBean("empUi");
        
        Scanner scanner=new Scanner(System.in);
        while(true){
        	empUserInterface.showMenu();
        	System.out.println("Enter Choice : ");
        	int choice=scanner.nextInt();
        	empUserInterface.performMenu(choice);
        }
    }
}
