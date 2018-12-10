package edu.bootcamp.topic_0.builder;

import java.sql.Connection;
public abstract class DBOpenSourceConnection implements DBConnection{
	
	
	@Override
	public abstract String name();
	
	@Override
	public abstract Connection connection();
	

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
