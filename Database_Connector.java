package com.database;
import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement; 

public class Database_Connector {
	public static void main(String args[]) throws ClassNotFoundException { 
		
	       Database_Connector d = new Database_connector();
	       d.connector();
		
	}
	
	public static String name;
	public static String pass;
	
	public static void connector()  {
		
		String driver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://esocial.gr/fixitup"; 
		String username ="fixitup"; 
		String password = "lgB52sslgB52slwgB52rs#5"; 
		Connection dbCon = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		String query ="select `uname` from Users"; 
		try {
		         Class.forName(driver);
		} catch  ClassNotFoundException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		}
		
		try { 
			//getting database connection to MySQL server
			dbCon = DriverManager.getConnection(dbURL, username, password); //getting PreparedStatment to execute query
			stmt = dbCon.prepareStatement(query); //Resultset returned by query
			rs = stmt.executeQuery(query); 
			rs.next();
			name = rs.getString("uname");
			System.out.print(dbCon);
			System.out.print(name);
			while(rs.next()){ int count = rs.getInt(1); 
      System.out.println("count of stock : " + count); } 
                    }
		catch (SQLException ex) {  } 
		finally{ 
			//close connection ,stmt and resultset here 
		 } 
         } 
 }
