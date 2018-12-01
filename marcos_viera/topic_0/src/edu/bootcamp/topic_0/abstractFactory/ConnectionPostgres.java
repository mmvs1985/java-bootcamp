package edu.bootcamp.topic_0.abstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgres implements IConnectionDBOpenSource {
	@Override
	public Connection getConnection(String dbName,String user,String password) {
		Connection conn= null;
		try {
			   Class.forName("org.postgresql.Driver");
			   conn= DriverManager.getConnection("jdbc:postgresql://localhost/"+dbName, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
