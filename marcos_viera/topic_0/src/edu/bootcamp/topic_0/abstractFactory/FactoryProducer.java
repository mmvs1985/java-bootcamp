package edu.bootcamp.topic_0.abstractFactory;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
		   
		      if(choice.equals("Commercial")){
		         return new DBCommercialFactory();
		         
		      }else if(choice.equals("OpenSource")){
		         return new DBOpenSourceFactory();
		      }
		      
		      return null;
		   }
}
