package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;

@Configuration
public class PerformanceConfiguration {

	@Bean("Vishal")
	public Singer getSinger(){
		return new Singer();
	}
	
	@Bean("Poojitha")
	public Juggler getJuggler(){
		return new Juggler();
	}
	
	@Bean("Amit")
	public Dancer getDancer(){
		return new Dancer();
	}
}
