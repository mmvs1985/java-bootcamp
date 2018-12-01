package edu.bootcamp.topic_0.abstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionMySql implements IConnectionDBOpenSource {
	

	@Override
	public Connection getConnection(String dbName,String user,String password) {
		Connection conn= null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			   conn= DriverManager.getConnection("jdbc:mysql://localhost/:"+ConstantsConfigFactory.MYSQLDBPORT +dbName, user, password);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
