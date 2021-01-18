package com.sujata.producer;

import java.util.List;

public class Singer implements Performer {

	private List<String> songs;

	public Singer() {
		System.out.println("Hi I am Singer Default Constructor");
	}

	public Singer(List<String> songs) {
		super();
		this.songs = songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.println("Singer is Singing : ");
		for (String song : songs) {
			System.out.print(song + " , ");
		}
		System.out.println();
	}

}
