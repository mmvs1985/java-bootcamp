package edu.bootcamp.topic_0.abstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionIBMDB2 implements IConnectionDBCommercial{
	
	float price = 20000;
	
	@Override
	public Connection getConnection(String dbName,String user,String password) {
		Connection conn= null;
		try {
			 Class.forName("COM.ibm.db2.jdbc.net.DB2Driver");//jdbc:db2:hostname:port Number/databaseName
			   conn= DriverManager.getConnection("jdbc:db2:localhost:"+ConstantsConfigFactory.IBMDB2PORT+"/"+dbName,user,password);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public float getPrice() {
		return price;
	}

}
