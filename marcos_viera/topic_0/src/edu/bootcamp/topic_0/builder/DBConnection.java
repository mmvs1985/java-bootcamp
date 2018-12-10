package edu.bootcamp.topic_0.builder;

import java.sql.Connection;

public interface DBConnection {

	
	public String name();
	public Connection connection();
	public float price();
	
	
}
