package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Vishal")
public class Singer implements Performer {

	@Value("LALALALA")
	private String song;
	
	
	public Singer(){
		System.out.println("Hi I am Singer Default Constructor");
	}
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("Hi I am setSong setter from Singer class");
	}

	@Override
	public void perform() {
		System.out.println("Singer is singning "+song+"!");

	}

}
