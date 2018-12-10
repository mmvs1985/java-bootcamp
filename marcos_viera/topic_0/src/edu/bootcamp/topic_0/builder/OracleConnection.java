package edu.bootcamp.topic_0.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import edu.bootcamp.topic_0.abstractFactory.ConstantsConfigFactory;

public class OracleConnection extends DBCommertialConnection{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Oracle";
	}

	@Override
	public Connection connection() {
		
		Connection conn = null;
		
		 
		   

		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   conn= DriverManager.getConnection("jdbc:oracle:thin:"+ConstantsConfig.DBUSERNAME+"/"+ConstantsConfig.DBPASSS+"@localhost/:"+ ConstantsConfig.ORACLEDBPORT+ConstantsConfig.DBNAME);
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
