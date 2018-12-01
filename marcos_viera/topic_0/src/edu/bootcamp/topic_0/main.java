package edu.bootcamp.topic_0;
import java.sql.Connection;
import java.sql.SQLException;

import edu.bootcamp.topic_0.abstractFactory.AbstractFactory;
import edu.bootcamp.topic_0.abstractFactory.FactoryProducer;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing the connection, at this time i select a MySQL Database 
		Connection con=ConnectionSingletton.getInstance().getConnectionMySql(ConstantsConfig.DBNAME, ConstantsConfig.DBUSERNAME, ConstantsConfig.DBPASSS);
			
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AbstractFactory abstractFactoryCommertial=FactoryProducer.getFactory("Commercial");
		AbstractFactory abstractFactoryOpenSource=FactoryProducer.getFactory("OpenSource");
	}

}
