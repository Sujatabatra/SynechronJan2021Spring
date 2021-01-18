package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformanceConfiguration {

	
	@Bean("Vishal")
	public Singer getSinger(){
		Singer s=new Singer();
		s.setSong("LALALALALALA");
		return s;
	}
	
	@Bean("Poojitha")
	public Juggler getJuggler(){
		return new Juggler(6);
	}
	
	@Bean("Amit")
	public Dancer getDancer(){
		return new Dancer();
	}
	
	@Bean("guit")
	public Guitar getGuitar(){
		return new Guitar();
	}
	
	@Bean
	public Drum drum(){
		return new Drum();
	}
	
	@Bean("tabla")
	public Tabla getTabla(){
		return new Tabla();
	}
	
	@Bean(name="Divya")
	public Instrumentalist getInstrumentalist(){
		return new Instrumentalist(getGuitar());
	}
	
	@Bean
	public Instrumentalist Geetinder(){
		Instrumentalist i=new Instrumentalist();
		i.setInstrument(getTabla());
		return i;
	}
}
