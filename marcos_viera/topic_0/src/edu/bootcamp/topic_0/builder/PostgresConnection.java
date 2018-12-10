package edu.bootcamp.topic_0.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection extends DBOpenSourceConnection{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Postgres";
	}

	@Override
	public Connection connection() {
		
		Connection conn = null;
		   try {
			   Class.forName("org.postgresql.Driver");
			   conn= DriverManager.getConnection("jdbc:postgresql://localhost/"+ConstantsConfig.DBNAME, ConstantsConfig.DBUSERNAME, ConstantsConfig.DBPASSS);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
