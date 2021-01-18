package com.sujata.producer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Singer implements Performer,BeanNameAware,InitializingBean,DisposableBean {

	private String song;
	private String name;
	
	public Singer(){
		System.out.println("Hi I am Singer Default Constructor");
	}
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("Hi I am setSong setter from Singer class");
	}

	@Override
	public void perform() {
		System.out.println(name+" is singning "+song+"!");

	}

	@Override
	public void setBeanName(String name) {
		this.name=name;
		System.out.println("SetBeanName");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After propertySet Method");
		
	}
	
	public void myInit(){
		System.out.println("Custom Init Method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hi I am disposable bean destroy method");
		
	}
	
	public void myDestroy(){
		System.out.println("Custom Destroy Method");
	}

}
