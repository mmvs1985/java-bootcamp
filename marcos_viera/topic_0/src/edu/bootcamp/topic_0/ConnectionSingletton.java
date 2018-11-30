package edu.bootcamp.topic_0;

import java.sql.*;

public class ConnectionSingletton {


	   private static ConnectionSingletton instance;
	   //private 
	   
	   
	   private String driver = "com.mysql.jdbc.Driver";  
	   private String url = "jdbc:mysql://localhost/";

	   //  Database user && pass
	   private String username ;
	   private String password ;


	private Connection conn;

	   private ConnectionSingletton(){}

		   //if the instance was not instanciated make the instance else return the unique instance
	   static public ConnectionSingletton getInstance(){
		   if (instance==null) {
			   instance=new ConnectionSingletton();
		   }
			   
	      return instance;
	   }
	   public Connection getConnectionPostgres(String dbName,String user,String password) {
		   try {
			   Class.forName("org.postgresql.Driver");
			   conn= DriverManager.getConnection("jdbc:postgresql://localhost/"+dbName, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	   }
		   
		  
	   public Connection getConnectionMySql(String dbName,String user,String password) {
		   try {
		         Class.forName("com.mysql.jdbc.Driver");
			   conn= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	   }

	
	
	
	
	

}
