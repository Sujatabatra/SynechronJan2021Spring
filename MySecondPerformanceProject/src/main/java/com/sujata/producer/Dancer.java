package com.sujata.producer;

public class Dancer implements Performer {

	
	public Dancer(){
		System.out.println("Hi I am default constructor of Dancer class");
	}
	
	
	@Override
	public void perform() {
		System.out.println("Dancer is performing in Free Style!");

	}

}
