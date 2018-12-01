package edu.bootcamp.topic_0.abstractFactory;

public class DBOpenSourceFactory extends AbstractFactory{

	@Override
	IConnectionDBCommercial getDBCommercial(String brand) {
		 //i left this null because i will implement it on DBCommercialFactory
		return null;
	}

	@Override
	IConnectionDBOpenSource getDBOpenSource(String name) {
		 if (name.equals("MySQL"))
			 return new ConnectionMySql();
		 else if 
		 (name.equals("Postgres"))
			 return new ConnectionPostgres();
		 else return null;
	}

}
