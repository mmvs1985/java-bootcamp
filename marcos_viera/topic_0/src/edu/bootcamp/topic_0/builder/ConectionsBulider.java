package edu.bootcamp.topic_0.builder;

public class ConectionsBulider {
	
	 public Connections prepareOpensource (){
		 Connections item = new Connections();
		 item.addItem(new MySqlConnection());
		 item.addItem(new PostgresConnection());
	      return item;
	   }   

	 public Connections prepareCommertials (){
		 Connections item = new Connections();
		 item.addItem(new OracleConnection());
		 
	      return item;
	   }   
}
