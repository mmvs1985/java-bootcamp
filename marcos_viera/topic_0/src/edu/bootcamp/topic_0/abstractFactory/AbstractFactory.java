package edu.bootcamp.topic_0.abstractFactory;

public abstract class AbstractFactory {
	
   abstract IConnectionDBCommercial getDBCommercial(String brand);
   abstract IConnectionDBOpenSource getDBOpenSource(String name) ;

}
