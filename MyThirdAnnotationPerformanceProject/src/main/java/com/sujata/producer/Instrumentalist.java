package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Divya")
public class Instrumentalist implements Performer {
	/*
	 * //Setter Injection
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("drum") private Instrument instrument;
	 * 
	 * public Instrumentalist() {
	 * 
	 * }
	 * 
	 * public void setInstrument(Instrument instrument) { this.instrument =
	 * instrument; }
	 */

	@Autowired
	@Qualifier("drum")
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();
	}

}
