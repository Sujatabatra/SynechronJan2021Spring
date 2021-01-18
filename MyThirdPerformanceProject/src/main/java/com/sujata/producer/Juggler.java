package com.sujata.producer;

public class Juggler implements Performer {

	private int balls;

	public Juggler(int balls) {
		super();
		this.balls = balls;
		System.out.println("HI I am Juggler Constructor");
	}

	

	public void setBalls(int balls) {
		System.out.println("Hi I am setBalls() setter from Juggler class");
		this.balls = balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling " + balls + " balls!");

	}

}
