package edu.bootcamp.topic_0.abstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOracle implements IConnectionDBCommercial{
	
	float price = 17500;
	
	
//	jdbc:oracle:thin:username/password@amrood:1521:EMP";

	@Override
	public Connection getConnection(String dbName,String user,String password) {
		Connection conn= null;
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			   conn= DriverManager.getConnection("jdbc:oracle:thin:"+user+"/"+password+"@localhost/:"+ ConstantsConfigFactory.ORACLEDBPORT +dbName);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
