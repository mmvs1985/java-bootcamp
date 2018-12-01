package edu.bootcamp.topic_0.abstractFactory;

import java.sql.Connection;

public interface IConnectionDBOpenSource {
	public Connection getConnection(String dbName,String user,String password);
}
