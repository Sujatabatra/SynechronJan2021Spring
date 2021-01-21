package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Amit")
public class Dancer implements Performer {

	private String style;

	public Dancer(@Value("Hip Hop") String style) {
		super();
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " + style + " style");

	}

}
