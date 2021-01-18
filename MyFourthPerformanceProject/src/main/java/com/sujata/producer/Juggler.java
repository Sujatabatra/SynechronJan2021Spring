package com.sujata.producer;

import java.util.Set;

public class Juggler implements Performer {

	private Set<Integer> balls;

	public Juggler() {

	}

	public Juggler(Set<Integer> balls) {
		super();
		this.balls = balls;
	}

	public void setBalls(Set<Integer> balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling " );
		for(Integer ball:balls){
			System.out.print(ball+" , ");
		}
		System.out.println();

	}

}
