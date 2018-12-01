package edu.bootcamp.topic_0.abstractFactory;

public class DBCommercialFactory extends AbstractFactory {

	@Override
	IConnectionDBCommercial getDBCommercial(String brand) {
		 if (brand.equals("Oracle"))
			 return new ConnectionOracle();
		 else if 
		 (brand.equals("IBM"))
			 return new ConnectionIBMDB2();
		 else return null;
	}

	@Override
	IConnectionDBOpenSource getDBOpenSource(String name) {
		// i left this null because i will implement it on DBOpensourceFactory
		return null;
	}
	

	 
}
